class Solution {
    public int characterReplacement(String s, int k) {
     int left =0;
     int right = 0;
     int maxLen = 0;
     int maxFreq = 0;
     int[] hash = new int[26];
     while(right<s.length())
     {
        char ch = s.charAt(right);
        hash[ch-'A']++;
        int freq = hash[ch-'A'];
        maxFreq = Math.max(freq,maxFreq);
        int windowSize = right-left+1;
        if(windowSize-maxFreq > k)
        {
            char leftChar = s.charAt(left);
            hash[leftChar-'A']--;
            left++;
        }else{
            maxLen = Math.max(windowSize,maxLen);
        }
        right++;
     }
     return maxLen;
    }
}