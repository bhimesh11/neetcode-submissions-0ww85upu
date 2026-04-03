class Solution {
    public int trap(int[] arr) {
        
        int totalwater =0;
        for( int i =0;i<arr.length;i++)
        {
            int leftMax =0;
            int rightMax =0;
            for(int j =0;j<=i;j++)
            {
                leftMax = Math.max(arr[j],leftMax);
            }
            for(int j =i;j<arr.length;j++)
            {
                rightMax = Math.max(arr[j],rightMax);
            }
            int water = Math.min(leftMax,rightMax)-arr[i];
            totalwater = totalwater+water;
        }
        return totalwater;
    }
}

