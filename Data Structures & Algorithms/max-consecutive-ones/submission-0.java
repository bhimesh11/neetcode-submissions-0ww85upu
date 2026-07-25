class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int maxAns = 0;
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
               ans++;
              maxAns = Math.max(ans,maxAns);
            }else{
                ans=0;
            }
        }
        return maxAns;
    }
}