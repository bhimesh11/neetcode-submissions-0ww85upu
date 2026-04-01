class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> hash = new HashMap<>();
        for(int i =0;i<nums.length;i++)
        {
            hash.put(nums[i], hash.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> h : hash.entrySet())
        {
            if(h.getValue()>1)
            {
                return true;
            }
        }
return false;
    }
}