class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

int[] c = new int[nums1.length+nums2.length];
        System.arraycopy(nums1,0,c,0,nums1.length);
       System.arraycopy(nums2,0,c,nums1.length,nums2.length);

        Arrays.sort(c);
        int low =0;
        int high = c.length-1;
        double median =0;
        int n = c.length;

       if(c.length%2!=0)
       {
        median = c[n/2];
       }else{
        median = (c[(n / 2) - 1] + c[n / 2]) / 2.0;
       // median = (c[(n / 2) - 1] + c[n / 2]) / 2.0;
       }
        return median;
    }
}
