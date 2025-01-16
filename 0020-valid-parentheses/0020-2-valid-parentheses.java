class Solution {
    public boolean isValid(String s) {
        // 홀수 거르기기
        if(s.length() % 2 != 0) {
            return false;
        }

        // 스택 초기화
        Stack<Character> stack = new Stack<>();

        // 반복문
        for(int i = 0; i < s.length(); i++) {
            // 입력되는 괄호 하나 정의
            char c = s.charAt(i);

            // 괄호가 만약 열린거면 스택저장
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else { // 닫혔을때
                // 만약 스택 비어있으면 false;
                if (stack.isEmpty()) {
                    return false;
                }

                // 맨위에있는걸 픽한다고 했을때
                char top = stack.peek();
                if((c == ')' && top == '(') ||
                (c == '}' && top == '{') ||
                ( c == ']' && top == '[')) {
                    // 괄호가 알맞게 맞으면 스택에서 제거
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        // 이후 스택이 비어있을때 알맞은 괄호배치
        return stack.isEmpty();
    }
}
