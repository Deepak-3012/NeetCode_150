
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //TC -> O(max(n,m)) -> n,m is the size of linked lists
        //SC -> O(max(n,m)) + 1 -> O(max(n,m))
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;
        while(l1 != null ||  l2 != null){
            int sum = 0;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum/10;
            ListNode new_node = new ListNode(sum % 10);
            curr.next = new_node;
            curr = curr.next;

        }
        if(carry != 0){
            ListNode new_node = new ListNode(carry);
            curr.next = new_node;

        }
        return dummy.next;
    }
}