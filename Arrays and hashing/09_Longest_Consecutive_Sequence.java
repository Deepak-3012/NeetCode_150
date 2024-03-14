class Solution {
    public int longestConsecutive(int[] nums) {
        
    // TC -> O(n)
    // SC -> O(n)
      
        Set <Integer> hs = new HashSet<>();
        for(int x : nums){
            hs.add(x);
        }
        int longest = 0;
        for(int x : nums){
           int prev = x - 1;
           int next = x + 1;
           int length = 1;
           while(hs.contains(prev)){
            length ++;
            hs.remove(prev);
            prev--;
           }
           while(hs.contains(next)){
            length ++;
            hs.remove(next);
            next++;
           }
            longest = Math.max(length,longest);

            }

        
        return longest;

    }
}