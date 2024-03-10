class Solution {
    public int[] topKFrequent(int[] nums, int k) {

     // TC O(n)
     // SC O(n)
     
        // freq for each elems
        HashMap<Integer , Integer> hm = new HashMap<>();
        for(int x : nums){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        // slight variation of bucket sort
        // for that we are going use array of arraylist
        List<Integer> buck[] = new ArrayList[nums.length+1];

        for(int x: hm.keySet()){
            int freq = hm.get(x);
            if(buck[freq] == null)
               buck[freq] = new ArrayList<>();
             buck[freq].add(x);
            

        }
        int [] result = new int[k];
        int ind = 0;
        for(int i=nums.length; i>=0; i--){
            if(buck[i] != null){
                for(int x: buck[i]){
                    result[ind] = x;
                    ind++;
                    if(ind == k)
                    return result;
                }
            }
        }



return result;
        
}
}