class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row  = matrix.length;
        int col = matrix[0].length;
        int low =0;
        int high = row * col -1;
         System.out.println(row);
          System.out.println(col);
           System.out.println(low);
        System.out.println(high);
        while(low<=high)
        {
           int  mid = (low+ high)/2;
           int n = mid/col;
           int m = mid%col;
           System.out.println("Mid value " + mid);
            System.out.println(n);
             System.out.println(m);
            if(matrix[n][m]==target)
            {
                return true;
            }else if(matrix[n][m]<target)
            {
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return false;
    }
}
