class Solution {

    public String encode(List<String> strs) {
		StringBuffer sb = new StringBuffer();
		for(String s : strs)
		{
			sb.append(s.length())
			.append('#')
			.append(s);
		}
		return sb.toString();
    }

    public List<String> decode(String str) {
		List<String> result = new ArrayList<String>();
		int i =0;
		while(i<str.length())
		{
			int j =i;
			while(str.charAt(j)!= '#')
			{
				j++;
			}
			int length = Integer.parseInt(str.substring(i, j));
			j++;
			String opString = str.substring(j , j+length);
			result.add(opString);
			i = j+length;
			
		}
		return result;
	
    }
}
