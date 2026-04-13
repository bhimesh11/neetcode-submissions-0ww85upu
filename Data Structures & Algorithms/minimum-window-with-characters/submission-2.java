class Solution {
    public String minWindow(String s, String t) {
		if(s.length()<t.length())
		{
			return "";
		}
        String result ="";
		int minLen = Integer.MAX_VALUE;

		for(int i =0;i<s.length();i++)
		{
			for(int j =i;j<s.length();j++)
			{
				String sub = s.substring(i,j+1);

				if(isValid(sub,t))
				{
					if(sub.length()<minLen)
					{
						minLen = sub.length();
						result = sub;
					}
				}
			}
		}
		return result;
    }
	public boolean isValid(String sub, String t)
	{
		int[] count = new int[256];

		for(char c: sub.toCharArray())
		{
			count[c]++;
		}
		for(char c: t.toCharArray())
		{
			if(count[c]==0)
			{
				return false;
			}
			count[c]--;
		}
		return true;
	}
}
