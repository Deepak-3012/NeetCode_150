class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        //TC -> O(n)
        //SC -> O(n)
        Deque<Integer> deque = new LinkedList<>();
        ArrayList<Integer> al = new ArrayList<>();
        int left = 0; int right = 0; 
        while(right < nums.length){
            while(!deque.isEmpty() && deque.peekLast() < nums[right]){
                deque.pollLast();
            }
            deque.offerLast(nums[right]);
            if(k <= right - left + 1){
                al.add(deque.peekFirst());
                if(deque.peekFirst() == nums[left++]){
                    deque.pollFirst();
                }
            }
            right++;
        }
        int [] res = new int[al.size()];
        for(int i = 0; i<al.size(); i++){
            res[i] = al.get(i);
        }
        return res;
    }
}