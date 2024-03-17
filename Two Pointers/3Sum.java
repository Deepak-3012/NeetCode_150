class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // TC -> O(nlogn + n^2) so it becomes n^2
        // SC -> O(n)
        HashSet<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0 ; i+2 < nums.length; i++){
            int j = i + 1;
            int k = nums.length -1; 
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    res.add(Arrays.asList(nums[i] , nums[j], nums[k]));
                    j++;
                    k--;
                }
                else if(sum < 0){
                    j++;
                }
                else{
                    k--;
                }
            }
            }
            return new ArrayList(res);
        }
        
    }
