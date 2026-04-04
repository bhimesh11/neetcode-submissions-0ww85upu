class Solution {
    public int characterReplacement(String s, int k) {
    //    int maxLen =0;
       
    //    for(int i =0;i<s.length();i++) 
    //    {
    //     int[] hash = new int[26];
    //     int maxFreq=0;
    //     for(int j=i;j<s.length();j++)
    //     {
    //        char ch = s.charAt(j);
    //        hash[ch-'A']++;
    //        int freq = hash[ch - 'A'];
    //        int windowSize = j-i+1;
    //        maxFreq = Math.max(freq,maxFreq);
    //        if(windowSize-maxFreq<=k)
    //        {
    //         maxLen = Math.max(windowSize,maxLen);
    //        }
    //     }
    //    }
    //    return maxLen;
    int left =0;
    int right =0;
    int maxLen =0;
    int maxFreq=0;
    int[] hash = new int[26];
    while(right<s.length())
    {
        char ch = s.charAt(right);
        hash[ch-'A']++;
        int freq = hash[ch-'A'];
        maxFreq = Math.max(freq,maxFreq);
        int windowSize = right-left+1;
        if(windowSize-maxFreq>k)
        {
            char leftChar = s.charAt(left);
            hash[leftChar-'A']--;
            left++;
        }
        else{
            maxLen = Math.max(windowSize,maxLen);
        }
        right++;

    }
    return maxLen;
    }
}
