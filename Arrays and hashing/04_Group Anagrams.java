class Solution {

    // TC -> O(n*k)
    // SC -> O(n*K)
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        List<List<String>> res = new ArrayList<>();

        for(String x : strs){
            int [] freq = new int[26]; // a - z
            for(char val : x.toCharArray()){
                  freq[val-'a']++;  
            }
            String value = Arrays.toString(freq);
            if(!hm.containsKey(value)){
                hm.put(value , new ArrayList<>());
            }
            hm.get(value).add(x);
        }
        res.addAll(hm.values());
        return res;
        
    }
}