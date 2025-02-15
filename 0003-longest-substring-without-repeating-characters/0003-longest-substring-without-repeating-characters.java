class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        int maxL = 0;
        int left = 0; // 윈도우 시작

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            
            if (map.containsKey(currentChar)) { // 중복된 문자가 존재하면
                left = Math.max(left, map.get(currentChar) + 1); // 왼쪽을 중복 문자의 다음 위치로
            }

            // 현재 문자 위치 저장
            map.put(currentChar, right);
            
            // 최대 길이 갱신
            maxL = Math.max(maxL, right - left + 1);
        }

        return maxL;
    }
}