class Solution {
    public int[] twoSum(int[] nums, int target) {
Map<Integer,Integer> hash = new HashMap<>();
        for(int i =0;i<nums.length;i++)
        {
            int compliment = target - nums[i];
            if(hash.containsKey(compliment))
            {
                return new int[]{hash.get(compliment),i};
            }
            hash.put(nums[i],i);
        }
        return new int[]{0,0};
    }
}