
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        //TC -> O(n)
        //SC -> O(1)
        ListNode temp = head;
        ListNode prevEnd = null;
        while (temp != null) {
            ListNode kthnode = getkthnode(temp,k);
            if(kthnode == null){
                if(prevEnd != null){
                    prevEnd.next = temp;
                }
                break;
            }
            ListNode nextNode = kthnode.next;
            kthnode.next = null;

            reverse(temp);
            if(temp == head){
                head = kthnode;
            }
            else{
                prevEnd.next = kthnode;
            }
            prevEnd = temp;
            temp = nextNode;
        }
        return head;

    }

    private ListNode reverse(ListNode node) {
        ListNode curr = node;
        ListNode prev = null;
        ListNode nextNode = node;
        while (curr != null) {
          nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }

    private ListNode getkthnode(ListNode temp, int k) {
        k -= 1;
        while (temp != null && k > 0) {
            k--;
            temp = temp.next;
        }
        return temp;
    }


}