class Solution {
    public int longestConsecutive(int[] nums) {
      Map<Integer,Boolean> exploremap = new HashMap();
	  int longestLength = 0;
	  for(int num: nums)
	  {
		exploremap.put(num,Boolean.FALSE);
	  }  

	  for(int num:nums)
	  {
		//moving forward and checking for possitive number will be availble in the map
		int currentlength = 1;
		int nextNum = num+1;
		while( exploremap.containsKey(nextNum) && 
		exploremap.get(nextNum)==false)
		{
			currentlength++;
			exploremap.put(nextNum,Boolean.TRUE);

			nextNum++;
		}
		//moving backward and  and checking for negitive number will be availble in the map
	int	prevNum = num-1;
	while(exploremap.containsKey(prevNum) && exploremap.get(prevNum)==false)
	{
		currentlength++;
		exploremap.put(prevNum,true);
			prevNum--;
			
	}
	longestLength  = Math.max(longestLength,currentlength);
	  }
	return longestLength;
    }
}
