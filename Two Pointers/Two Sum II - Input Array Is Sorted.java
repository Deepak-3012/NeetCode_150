class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //TC -> O(n)
        //SC -> O(1) we are returning an array but its length is 2 all the time(constant)
    // Two pointer approach
    int i = 0;
     int j = numbers.length-1;
     while(numbers[i] + numbers[j] != target){
        if(numbers[i] + numbers[j] < target)    {
            i++;
        }
        else if(numbers[i] + numbers[j] > target){
            j--;
        }
      
     }
     return new int[] {i+1, j+1};
        
    }
}