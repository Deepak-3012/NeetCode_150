class Solution {
    public int findDuplicate(int[] nums) {
        // TC -> O(n)
        // SC -> O(1)
        int slow = 0;
        int fast = 0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (fast != slow);
        int slow2 = 0;
        do {
            slow = nums[slow];
            slow2 = nums[slow2];
        } while (slow != slow2);
        return slow2;
    }
}