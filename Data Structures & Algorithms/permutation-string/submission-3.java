class Solution {
    public boolean checkInclusion(String s1, String s2) {
       int[] s1hash = new int[26];
       int[] s2hash = new int[26];
       int right =0;
       int left =0;
       if(s1.length()>s2.length())
       {
        return false;
       }
       while(right<s1.length())
       {
        s1hash[s1.charAt(right)-'a']++;
        s2hash[s2.charAt(right)-'a']++;
        right++;
        
       }
      if (Arrays.equals(s1hash, s2hash)) return true;
       while(right<s2.length())
       {
  s2hash[s2.charAt(right)-'a']++;
  s2hash[s2.charAt(left)-'a']--;
    left++;
    right++;
      if (Arrays.equals(s1hash, s2hash)) return true;
       }
       return false;
    }
    
}
