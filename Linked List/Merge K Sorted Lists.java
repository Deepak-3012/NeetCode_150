
class Solution {
    // TC-> O(k*log(k) + n*k*log(k))
    // SC-> O(k)
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0)
            return null;
        PriorityQueue<ListNode> pq = new PriorityQueue<>((o1, o2) -> {
            return o1.val - o2.val;
        });
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null)
                pq.offer(lists[i]);
        }
        while (pq.size() > 0) {
            ListNode curr = pq.poll();
            prev.next = curr;
            prev = prev.next;
            if (curr.next != null) {
                pq.offer(curr.next);
            }

        }
        return dummy.next;
    }
}