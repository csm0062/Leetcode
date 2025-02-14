class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                int prevIndex = map.get(nums[i]);
                if(i - prevIndex <= k) { // k보다 작거나 같다는 조건이있을때
                    return true; // return true.
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}