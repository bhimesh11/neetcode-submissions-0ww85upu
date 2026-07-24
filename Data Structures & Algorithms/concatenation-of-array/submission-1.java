class Solution {
    public int[] getConcatenation(int[] nums) {
      int[] n = new int[2*nums.length];
     // int i =0;
    //   while(i<nums.length)
    //   {
    //     n[i] = nums[i];
    //     i++;
    //   }
    //   System.out.println(i);
    //    System.out.println(n.length);
    //    int j =0;
    //   while(i<n.length)
    //   {
    //     n[i] = nums[j];
    //     i++;
    //     j++;
    //   }
    for(int i =0;i<nums.length;i++)
    {
        n[i] = nums[i];
        n[i+nums.length] = nums[i];
    }
    
return n;
    }
}