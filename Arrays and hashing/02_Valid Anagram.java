class Solution {

    // TC -> O(n)
    // SC -> O(n)

    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char x : s.toCharArray()){  // getting the freq of s
            hm.put(x, hm.getOrDefault(x,0)+1);
        }
        for(char x : t.toCharArray()){ // decrementing the freq of t so that eventually it becomes 0
            hm.put(x, hm.getOrDefault(x,0)-1);
        }
        for(int value: hm.values()){ 
            if(value != 0)
            return false;
        }
        return true;
    }
}