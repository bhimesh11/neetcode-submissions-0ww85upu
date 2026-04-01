class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack();
        if(s.length()==0 || s.length()==1)
        {
            return false;
        }
        for(Character c: s.toCharArray())
        {
            if(c == '(' || c == '{' || c=='[')
            {
                st.push(c);
            }else{
                if(st.isEmpty())
                {
                    return false;
                }
                    char r = st.peek();
                    if((
                        c ==')' && r == '('||
                        c=='}' && r == '{' || 
                        c==']' && r=='['))
                        {
                            st.pop();
                        }else{
                            return false;
                        }
        }
       
    }
     return st.isEmpty();
}
}
