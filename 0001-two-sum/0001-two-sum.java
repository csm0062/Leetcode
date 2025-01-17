class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // {현재숫자(키): 인덱스(값)}-> 인덱스가 필요하니까
        // 처음엔 {} 빈 값 이겠죠?
        // temp가 해시맵에있는지 확인
        for(int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];// 값

            // 만약 temp(해당키)가 있을 경우
            if(map.containsKey(temp)) {
                // {temp가 있는 인덱스, i} (새)배열 뽑기
                return new int[] {map.get(temp), i};
            }
            //해시맵에 entry추가
            map.put(nums[i], i);
        }
        return new int[0];
    }
}