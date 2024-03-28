class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    // TC -> O(log nxm) or O(log N)
    // SC -> O(1)
    
    int row = matrix.length;
    int col = matrix[0].length;
    int left = 0;
    int right = (row * col) - 1;
    
    // usual binary search
    while(left <= right){
        int mid = (left + right) / 2;
        int midValue = matrix[mid / col][mid % col];
        if( midValue > target){
            right = mid - 1;
        }
        else if( midValue < target){
            left = mid + 1;
        }
        else if( midValue == target){
            return true;
        }
    }
        
   return false;
   }
}