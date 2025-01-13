class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return null; // 2개의 숫자가 target 값을 만들 지 못할 경우 처리
    }
}

// 모든 경우의 수로 검색했기 때문에 비 효율적