class Solution {
    public List<String> generateParenthesis(int n) {
        // TC -> O(2^n)
        // SC -> O(2^n)
        List<String> res = new ArrayList<>();
        backtrack(res,"",0,0,n);
        return res;
        
    }
    public void backtrack(List<String> res, String s , int open , int close , int max){

        if(s.length() == max * 2){
            res.add(s);
            return;
        }
        if(close < open){
          
            backtrack(res ,s + ")", open, close + 1, max);
        }
        if(open < max){
            
            backtrack(res , s + "(" , open+1 , close , max);
        }

    }

}