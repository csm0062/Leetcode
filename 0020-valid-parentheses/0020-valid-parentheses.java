class Solution {
    public boolean isValid(String s) {
        // 열린거 stack에 닫힌건 비교해서 빼기.
        // 스택은 후입 선출
        // 홀수 거르기
        if(s.length() % 2 != 0)
            return false;

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            switch(s.charAt(i)) {
                case ')':
                    if(!stack.isEmpty() && stack.peek() == '(')
                        stack.pop();
                    else
                        return false;
                    break;

                case '}':
                    if(!stack.isEmpty() && stack.peek() == '{')
                        stack.pop();
                    else
                        return false;
                    break;

                case ']':
                    if(!stack.isEmpty() && stack.peek() == '[')
                        stack.pop();
                    else
                        return false;
                    break;

                // 열린괄호는 스택에 넣는다.    
                default:
                    stack.push(s.charAt(i));
                    break;
            }
        }
        // 스택비면 true 반환
        return stack.isEmpty();
    }
}