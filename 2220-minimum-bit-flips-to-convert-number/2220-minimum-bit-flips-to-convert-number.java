class Solution {
    public int minBitFlips(int start, int goal) {
        // XOR 연산자는 두 비트가 서로 다르면 1 같으면 0이니까
        // 같은건 뒤집지 X하려면 0보다 큰 걸 뒤집는다
        // 1010 -> 0111
        // XOR -> 1101 -> 1인것만 뒤집기
        // 1011 -> 1111 -> 0111
        int xor = start ^ goal;
        int cnt = 0;

        while (xor > 0) {
            // 원소 하나씩 지우기 (맨오른쪽부터 1을 뺀다)
            xor &= (xor -1);
            cnt++;
        }
        return cnt;
    }
}