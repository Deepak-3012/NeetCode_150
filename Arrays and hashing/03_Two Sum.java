class Solution {

// TC -> O(n)
// SC -> O(n)
    
    public int[] twoSum(int[] nums, int target) {
        //eg: 3 5 2 9 target 8 
        // so we have to return index of 3 and 5
        Map<Integer, Integer> hm = new HashMap<>();
        int [] res = new int[2];
        for(int i=0; i<nums.length; i++){
            // target = nums[i] + elem
            // elem = target - nums[i]
            int elem = target - nums[i];
            if(hm.containsKey(elem)){
                res[0] = i;
                res[1] = hm.get(elem);
                return res;

            }
            else{
                hm.put(nums[i],i);
            }
        }
        return res;
    }
}