class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] values = new int[temperatures.length];
      
        for(int i =0;i<=temperatures.length-1;i++)
        {
            for(int j = i+1;j<temperatures.length;j++)
            {
                if(temperatures[j]>temperatures[i])
                {
                    int val = j-i;
                    values[i] = val;
                    break;
                }else{
                    values[i] =0;
                }
            }
        }
        return values;
    }
}
