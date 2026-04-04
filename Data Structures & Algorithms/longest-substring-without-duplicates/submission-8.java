class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
        {
            return 0;
        }
        if(s.length()==1)
        {
            return 1;
        }

        int left =0;
        int right =0;
        int maxLen = 0;
        int[] hash = new int[256];
       Arrays.fill(hash,-1);
        while(right<s.length())
        {
            char ch = s.charAt(right);

            if(hash[ch]!=-1)
            {
               left = Math.max(left, hash[ch]+1);
              //left = hash[ch]+1;
            }

            int len = right-left+1;
            maxLen = Math.max(len,maxLen);
            hash[ch]=right;
            right++;
        }
        return maxLen;
    }
}
