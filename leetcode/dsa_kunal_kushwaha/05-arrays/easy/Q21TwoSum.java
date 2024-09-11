class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer,Integer> numHashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            numHashMap.put(nums[i],i);
        }
        for (int i = 0; i < n; i++) {
            int checkAns = target-nums[i];
            if(numHashMap.containsKey(checkAns) && numHashMap.get(checkAns)!=i) {
                return new int[]{i,numHashMap.get(checkAns)};
            }
        }
        return new int[]{0,0};
    }
}