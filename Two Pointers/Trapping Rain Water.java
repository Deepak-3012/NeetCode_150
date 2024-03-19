class Solution {
    public int trap(int[] height) {
        if(height.length == 0)
        return 0;
        // TC -> O(n)
        // SC -> O(1)

        // Using Two Pointer
        int i = 0;
        int j = height.length-1;
        int result = 0;
        int left_max = height[i];
        int right_max = height[j];

        while(i<j){
            if(left_max < right_max){
                i++;
                left_max = Math.max(left_max , height[i]);
                result += left_max - height[i];
            }
            else{
                j--;
                right_max = Math.max(right_max , height[j]);
                result += right_max - height[j];
            }
        }
        return result;
        
    }
}