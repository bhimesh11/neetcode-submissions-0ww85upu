class Solution {
    public boolean hasDuplicate(int[] nums) {
//     //    for(int i =0;i<nums.length;i++)
//     //    {
//     //     for(int j =i+1;j<nums.length;j++)
//     //     {
//     //         if(nums[i]==nums[j])
//     //         {
//     //             return true;
//     //         }
//     //     }
//     //    } 
//     //    return false;
//     int n = nums.length;
//     Set<Integer> numbers = new HashSet<Integer>();
//     boolean hasDuplicate = false;
//     for(int k : nums)
//     {
//       // numbers.add(k);
//       if(!numbers.add(k))
//       {
// hasDuplicate = true;
// break;
//       }

//     }
//     return hasDuplicate;
//     // if(nums.length==numbers.size())
//     // {
//     //     return false;
//     // }
//     // return true;
//     // }
Map<Integer, Integer> maps = new HashMap<Integer, Integer>();
		for(int i =0;i<nums.length;i++)
		{
			maps.put(nums[i], maps.getOrDefault(nums[i], 0)+1);
		}
		//System.out.println(maps);
		for(Map.Entry<Integer, Integer> res : maps.entrySet())
		{
			if(res.getValue()>1)
			{
				return true;
			}
		}
        return false;
}
}