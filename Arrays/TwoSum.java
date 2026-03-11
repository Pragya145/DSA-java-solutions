class Solution {
    public int[] twoSum(int[] nums, int target) {
      //using hashmap as it takes O(1)time
      HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];

            if (map.containsKey(need)) {
                return new int[]{map.get(need), i};
            }

            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
