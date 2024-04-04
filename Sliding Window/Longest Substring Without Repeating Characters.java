class Solution {
    public int lengthOfLongestSubstring(String s) {
        //TC -> O(n)
        //SC -> O(n)
        int n = s.length();
        Set<Character> hs = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        for(int right = 0; right < n; right++){
            if(!hs.contains(s.charAt(right))){
                hs.add(s.charAt(right));
                maxLength = Math.max(maxLength , right - left + 1);
            }
            else{
                while(hs.contains(s.charAt(right))){
                    hs.remove(s.charAt(left));
                    left++;
                }
                
            }
            hs.add(s.charAt(right));
            
        }
        return maxLength;
    }
}