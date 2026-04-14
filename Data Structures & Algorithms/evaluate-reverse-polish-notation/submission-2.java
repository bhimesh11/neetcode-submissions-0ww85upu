class Solution {
    public int evalRPN(String[] tokens) {
       Stack<Integer> st = new Stack<>(); 
        for(String s: tokens)
        {
            if(!s.equals("+") && !s.equals("-")&&!s.equals("*")&&!s.equals("/"))
        {
            st.push(Integer.parseInt(s));
        }else{
            int b = st.pop();
            int a = st.pop();
            int value =0;
            if(s.equals("+"))
            {
               value = a+b; 
            }
            else if(s.equals("-"))
            {
               value = a-b; 
            }
             else if(s.equals("*"))
            {
               value = a*b; 
            }
            else if(s.equals("/"))
            {
               value = a/b; 
            }
            st.push(value);
        }
        }
        return st.peek();
    }
}
