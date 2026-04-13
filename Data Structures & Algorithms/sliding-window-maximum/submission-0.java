class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length-k+1];
		for(int i =0;i<=nums.length-k;i++)
		{
			int maxValue = Integer.MIN_VALUE;

			for(int j =i;j<i+k;j++)
			{
				maxValue = Math.max(maxValue,nums[j]);
			}
			result[i]=maxValue;
		}
		return result;
    }
}
