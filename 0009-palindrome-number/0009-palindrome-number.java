class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        int num = x;
        int reversed = 0; //초기화

        while(x != 0) { //x가 0되면 종료
            int temp = x % 10; // 나머지

            x /= 10 ; //마지막 빼고 몫

            reversed = (reversed * 10) + temp; //뒤집힌 숫자
        }

        if(num == reversed)
            return true;
        else 
            return false;
    }
}