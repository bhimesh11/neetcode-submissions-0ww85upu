class Solution {
    public String minWindow(String s, String t) {
		if(s.length()<t.length())
		{
			return "";
		}

		Map<Character,Integer> tmap = new HashMap<>();
		for(int i =0;i<t.length();i++)
		{
			tmap.put(t.charAt(i),tmap.getOrDefault(t.charAt(i),0)+1);
		}
		int right =0;
		int left =0;
		int formed =0;
		int required = tmap.size();
		int start =0;
		int minLen = Integer.MAX_VALUE;

		Map<Character,Integer> wmap = new HashMap<>();
		while(right<s.length())
		{
			char charc = s.charAt(right);
			wmap.put(charc, wmap.getOrDefault(charc,0)+1);

			if(tmap.containsKey(charc)
			&&
			tmap.get(charc).intValue() == wmap.get(charc).intValue())
			{
				formed++;
			}
			while(left<=right && formed==required)
			{
				if(right-left+1<minLen)
				{
					minLen =right-left+1;
					start = left;
				}
			char leftchar = s.charAt(left);
			wmap.put(leftchar,wmap.get(leftchar)-1);
				if(tmap.containsKey(leftchar)&& 
				tmap.get(leftchar) > wmap.get(leftchar))
			{
				formed--;
			}
			left++;
			}
			right++;

		}
		return minLen == Integer.MAX_VALUE ? "": s.substring(start,start+minLen);
    //    String result ="";
	// 	int minLen = Integer.MAX_VALUE;

	// 	for(int i =0;i<s.length();i++)
	// 	{
	// 		for(int j =i;j<s.length();j++)
	// 		{
	// 			String sub = s.substring(i,j+1);

	// 			if(isValid(sub,t))
	// 			{
	// 				if(sub.length()<minLen)
	// 				{
	// 					minLen = sub.length();
	// 					result = sub;
	// 				}
	// 			}
	// 		}
	// 	}
	// 	return result;
    // }
	// public boolean isValid(String sub, String t)
	// {
	// 	int[] count = new int[256];

	// 	for(char c: sub.toCharArray())
	// 	{
	// 		count[c]++;
	// 	}
	// 	for(char c: t.toCharArray())
	// 	{
	// 		if(count[c]==0)
	// 		{
	// 			return false;
	// 		}
	// 		count[c]--;
	// 	}
	// 	return true;
	// }
}
}
