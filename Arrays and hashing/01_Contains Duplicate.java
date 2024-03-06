class Solution {

    // TC -> O(n)
    // SC -> O(n)
    public boolean containsDuplicate(int[] nums) {
        
    Set<Integer> hs = new HashSet<>(); // leveraging the fact that hashset does not contains duplicates
    for(int i=0; i<nums.length; i++){
        if(hs.contains(nums[i])){
            return true;
        }
        else{
            hs.add(nums[i]);
        }
    }
    return false;
    }
}