class Solution {
    public int maxArea(int[] height) {
      // TC -> O(n)
      // SC -> O(1) 
        int max_area = 0;
        // Two pointer approach
        int i = 0;
        int j = height.length - 1;
        while(i<j){
            int area = (j-i) * Math.min(height[i] , height[j]);
            max_area = Math.max(max_area , area);
            if(height[i] < height[j]){
                i++;
            }
            else {
                j--;
            }
        }
        return max_area;
    }
}