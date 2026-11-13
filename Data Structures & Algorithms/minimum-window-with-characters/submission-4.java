class Solution {
    public String minWindow(String s, String t) {
        int[] maps = new int[128];
        int[] mapt = new int[128];
        for(char c: t.toCharArray())
        {
            mapt[c]++;
        }
        int left =0;
        int right =0;
        int minLen = Integer.MAX_VALUE;
        int minStart =0;
        for(;right<s.length();right++)
        {
            maps[s.charAt(right)]++;

            while(contains(maps,mapt))
            {
                if(right-left+1 < minLen)
                {
                    minLen = right-left+1;
                    minStart=left;
                }
                maps[s.charAt(left++)]--;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);

    }
    public boolean contains(int[]maps,int[] mapt)
    {
        for(int i =0;i<128;i++)
        {
            if(maps[i]<mapt[i])
            {
                return false;
            }
        }
        return true;
    }
}
