class Solution {
    public int lengthOfLongestSubstring(String s) {
       int maxLen = 0;
       int left =0;
       int right= 0;
       Map<Character,Integer> m = new HashMap();
       for(right =0;right<s.length();right++)
       {
        char current = s.charAt(right);
        if(m.containsKey(current) && left<=m.get(current))
        {
            left = m.get(current)+1;
        }
        m.put(current,right);
        maxLen = Math.max(maxLen, right-left+1);
       }
return maxLen;
    }
}
