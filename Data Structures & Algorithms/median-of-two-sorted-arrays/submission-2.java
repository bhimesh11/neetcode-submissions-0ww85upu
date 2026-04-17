class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

// int[] c = new int[nums1.length+nums2.length];
//         System.arraycopy(nums1,0,c,0,nums1.length);
//        System.arraycopy(nums2,0,c,nums1.length,nums2.length);

//         Arrays.sort(c);
//         int low =0;
//         int high = c.length-1;
//         double median =0;
//         int n = c.length;

//        if(c.length%2!=0)
//        {
//         median = c[n/2];
//        }else{
//         median = (c[(n / 2) - 1] + c[n / 2]) / 2.0;
//        // median = (c[(n / 2) - 1] + c[n / 2]) / 2.0;
//        }
//         return median;

int m = nums1.length;
int n = nums2.length;
//always check with smaller array
if(m>n)
{
    return findMedianSortedArrays(nums2,nums1);
}
int low =0;
int high = m;
int left = (m+n+1)/2;
while(low<=high)
{
    int mid1 = (low+high)/2;
    int mid2 = left -mid1;
    int l1 = Integer.MIN_VALUE;
    int l2 = Integer.MIN_VALUE;

    int r1 = Integer.MAX_VALUE;
    int r2 = Integer.MAX_VALUE;

     if(mid1<m)
     {
    r1 = nums1[mid1];
    }
     if(mid2<n)
     {
r2 =  nums2[mid2];
    }
     if(mid1-1>=0)
     {
        l1 = nums1[mid1-1];
     }
     if(mid2-1>=0)
     {
          l2 = nums2[mid2-1];
   }
    if(l1<=r2 && l2<=r1)
    {
        if((m+n)%2==0)
        {
             return ((double) Math.max(l1,l2) + Math.min(r1,r2))/2.0;
        }else{
          return Math.max(l1,l2);
        }
    }else if(l1>r2)
    {
        high = mid1-1;
    }else{
        low = mid1+1;
    }
}
throw new IllegalArgumentException("Input arrays are not sorted");
    }
     
}
