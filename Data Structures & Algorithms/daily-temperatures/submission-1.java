class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] values = new int[temperatures.length];
        Stack<Integer> st = new Stack<>();
        for(int i =0;i<temperatures.length;i++)
        {
            while(!st.isEmpty()&& temperatures[i]>temperatures[st.peek()])
            {
                int idx = st.pop();
                values[idx] = i - idx;
            }
            st.push(i);
        }
        return values;
    }
}
