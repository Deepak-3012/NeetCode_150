public class Solution {
    public boolean hasCycle(ListNode head) {
        //TC -> O(n)
        //SC -> O(1)
        ListNode fast = head;
        ListNode slow  = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
        
    }
}