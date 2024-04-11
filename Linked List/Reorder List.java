
class Solution {
    public void reorderList(ListNode head) {
        //TC -> O(n)
        //SC -> O(1)
        if(head == null || head.next == null){
            return;
        }
        // finding mid thourgh slow-fast pointer technique
        ListNode slow = head; 
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;//moves one point ahead
            fast = fast.next.next;//moves two point ahead
        }
        ListNode mid = slow;

        //reverse second linked list
        ListNode current = mid.next;
        ListNode previous = null;
        ListNode next = null;
        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        //separate into 2 list
        mid.next = null;
        //Merging
        ListNode first = head;
        ListNode second = previous;
        ListNode temp1;
        ListNode temp2;
        while(first != null && second != null){
            temp1 = first.next;
            first.next = second;
            temp2 = second.next;
            second.next = temp1;
 
        first = temp1;
        second = temp2;
    }
    }
    }
