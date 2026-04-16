class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max =0;
        for(int pile: piles)
        {
            max = Math.max(max,pile);
        }
        int low =1;
        int high = max;
        int ans = Integer.MAX_VALUE;
        while(low<=high)
        {
            int mid = (low+high)/2;
            int totalhours = 0;
            for(int pile: piles)
            {
                totalhours += (pile+mid-1)/mid;
            }
            if(totalhours<=h)
            {
                high = mid-1; 
            }else{
                low = mid+1;
            }
        }

        // for(int i =1;i<=max;i++)
        // {
        //     int totalHours =0;

        //     for(int pile:piles)
        //     {
        //         totalHours+=(pile+i-1)/i;
        //     }
        //     if(totalHours<=h)
        //     {
        //         return i;
        //     }
            
        // }
         return low;
    }
}
