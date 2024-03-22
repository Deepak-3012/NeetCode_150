class Solution {
    public int evalRPN(String[] tokens) {

        //TC -> O(n) , actually O(2n) hence O(n)
        //SC -> O(n)
        Stack<Integer> st = new Stack<>();
        for(String token : tokens){
            if(token.equals("+")){ 
                st.add(st.pop() + st.pop());
            }
            else if(token.equals("-")){
                int a = st.pop();
                int b = st.pop();
                st.add(b-a);
            }
            else if(token.equals("*")){
                st.add(st.pop() * st.pop());

            }
            else if(token.equals("/")){
                int a = st.pop();
                int b = st.pop();
                st.add(b/a);

            }
            else{
                st.add(Integer.parseInt(token));
            }
        }
        return st.pop();
        
    }
}