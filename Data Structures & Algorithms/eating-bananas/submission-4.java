class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        int low = 1;
        for(int pile: piles)
        {
            max = Math.max(pile,max);
        }
        int high = max;
        while(low<high)
        {
            int mid = low + (high-low)/2;
            long totalhours =0;
            for(int pile : piles)
            {
                totalhours = totalhours+(pile+ (long) mid-1)/mid;
            }
            if(totalhours<=h)
            {
                high = mid;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
}
