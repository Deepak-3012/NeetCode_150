class Solution {
    public boolean checkInclusion(String s1, String s2) {
        //TC -> O(n)
        //SC -> O(n) -->O(2n) so, O(n)
        if(s1.length() > s2.length())
        return false;
        HashMap <Character,Integer> need = new HashMap<>();
        HashMap <Character,Integer> have = new HashMap<>();
        // populate need map
        for(int i = 0; i<s1.length(); i++){
            if(!need.containsKey(s1.charAt(i)))
            need.put(s1.charAt(i) , 0);
            need.put(s1.charAt(i) , need.get(s1.charAt(i)) + 1);
        }
            //sliding window
            int left = 0;
            int right = 0;
            while(right < s2.length()){
                char elem = s2.charAt(right);
                if(!need.containsKey(elem)){
                    right ++;
                    left = right;
                    have.clear();
                    continue;
                }
                if(!have.containsKey(elem))
                have.put(elem,0);
                have.put(elem,have.get(elem)+1);
            
            while(have.get(elem) > need.get(elem)){
                char startval = s2.charAt(left);
                have.put(startval , have.get(startval)-1);
                left++;
            }
            int windowSize = right - left + 1;
            if(windowSize == s1.length()){
                return true;
            }
            right++;
            
        }
        return false;
    }
}