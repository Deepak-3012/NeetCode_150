class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        // TC-> O(log(max elem of given array))
        // SC-> O(1)
        int low = 0;
        int high = findmax(piles);
        int max = Integer.MIN_VALUE;
        while(low <= high){
            int mid = (low + high) / 2;
            int hourValue = findHourVal(mid , piles);
            
                if(hourValue <= h){
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }

            }
            return low; // final ans always reached in low val
    }
    public int findmax(int [] arr){
        int max = Integer.MIN_VALUE;
        for(int i =0 ; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public int findHourVal(int k , int [] arr){
        int val = 0;
        for(int i = 0; i<arr.length; i++){
            val  += Math.ceil((double)arr[i] / (double)k);
        }
        return val;
    }
}