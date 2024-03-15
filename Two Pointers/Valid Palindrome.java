class Solution {
    public boolean isPalindrome(String s) {
    // TC -> O(n)
    // SC -> O(1)
        if(s.isEmpty())
        return true;
     
     // two pointer approach
        int start = 0;
        int end = s.length() - 1;

        
        while(start<end){
            char curr_start = s.charAt(start);
            char curr_end = s.charAt(end);
       
            if(!Character.isLetterOrDigit(curr_start))
            {
                start++;
            }
            else if(!Character.isLetterOrDigit(curr_end)){
                end--;
            }
            else if(Character.toLowerCase(curr_start) != Character.toLowerCase(curr_end)){
                return false;
            }
            else {
            start++;
            end--;
            }
            }
            
            return true;
        }
        
    }
