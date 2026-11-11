class Solution {
    public int trap(int[] height) {
       int totalwater =0;
       int left =0;
       int right=height.length-1;
       int maxLeft = height[left];
       int maxRight = height[right];
     
       while(left<right)
       {
        if(maxLeft<maxRight)
        {
            left++;
            maxLeft = Math.max(maxLeft,height[left]);
            totalwater += maxLeft-height[left];
        }
        else{
            right--;
            maxRight = Math.max(maxRight,height[right]);
                totalwater += maxRight-height[right];
        }
       } 
       return totalwater;
    }
}
