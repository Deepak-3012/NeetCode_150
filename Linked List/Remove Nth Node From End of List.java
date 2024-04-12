
class Solution {
    //TC -> O(N), N -> size of the linked list
    //SC -> O(1)
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        for(int i=0; i<n; i++){
            fast = fast.next;
            if(fast == null){
                return head.next;
            }
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        ListNode delNode = slow.next;
        slow.next = slow.next.next;
        delNode = null;
        return head;

        
    }
}