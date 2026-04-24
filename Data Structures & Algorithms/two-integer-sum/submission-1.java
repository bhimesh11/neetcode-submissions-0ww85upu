class Solution {
    public int[] twoSum(int[] nums, int target) {


// int left =0;
// int right = nums.length-1;
// Arrays.sort(nums);
// while(left<right)
// {
//     int sum = nums[left] + nums[right];
//     if(sum==target)
//     {
//         return new int[]{left,right};
//     }else if(sum<target)
//     {
// left++;
//     }else{
//         right--;
//     }
// }
// return new int[]{-1,-1};

Map<Integer,Integer> hash =new HashMap<>();
// for(int i =0;i<nums.length;i++)
// {
//     int sum = target - nums[i];
//     if(hash.containsKey(sum))
//     {
//         return new int[]{hash.get(sum),i};
//     }
//     hash.put(nums[i],i);

for(int i =0;i<nums.length;i++)
{
	int compliment = target-nums[i];
	if(hash.containsKey(compliment))
	{
		return new int[]{hash.get(compliment),i};
	}
	hash.put(nums[i],i);
}
return new int[]{-1,-1};

// }
// return new int[]{-1,-1};
     	// int[] ans = new int[2];
		// for(int i =0;i<nums.length;i++)
		// {
		// 	for(int j =i+1;j<nums.length;j++)
		// 	{
		// 		if(nums[i] + nums[j]==target)
		// 		{
		// 			ans[0] = i;
		// 			ans[1] =j;
		// 			return ans;
		// 		}
		// 	}
		// }
		// return new int[] {-1,-1};
	
    }
}
