class Solution {
    public int largestRectangleArea(int[] heights) {
       Stack<Integer> st = new Stack<>();
       int maxArea =0;
       for(int i =0;i<heights.length;i++)
       {
        while(!st.isEmpty() && heights[i]<heights[st.peek()])
        {
            int height = heights[st.pop()];
            int right = i;
            int left =0;
            if(st.isEmpty())
            {
              left = -1;  
            }else{
                left = st.peek();
            }
            int width = right-left -1;
            int area = height * width;
            maxArea = Math.max(area, maxArea);
        }
        st.push(i);
       } 
       while(!st.isEmpty())
       {
         int height = heights[st.pop()];
            int right = heights.length;
            int left =0;
            if(st.isEmpty())
            {
              left = -1;  
            }else{
                left = st.peek();
            }
            int width = right-left -1;
            int area = height * width;
            maxArea = Math.max(area, maxArea);
       }
       return maxArea;
    }
}
