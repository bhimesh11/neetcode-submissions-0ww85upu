class Solution {
    public boolean isAnagram(String s, String t) {
        // s = s.chars()
		// 		.sorted()
		// 		.mapToObj(c -> String.valueOf((char)c))
		// 		.collect(Collectors.joining());
		
		// t = t.chars()
		// 		.sorted()
		// 		.mapToObj(c -> String.valueOf((char)c))
		// 		.collect(Collectors.joining());
		
		// if(s.equals(t))
		// {
		// 	return true;
		// }
        // return false;
        	if(s.length()!=t.length())
		{
			return false;
		}

int[] count = new int[26];
		
		for(int i =0;i<s.length();i++)
		{
			count[s.charAt(i)-'a']++;
			count[t.charAt(i)-'a']--;
		}
		for(int c : count)
		{
			if(c!=0)
			{
				return false;
			}
		}
		return true;
        
    }
}

//aacccceerrrr
