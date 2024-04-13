
class Solution {
    public Node copyRandomList(Node head) {
        //TC-> O(2n) -> O(n)
        //SC-> O(n)
        Node curr = head;
        Node res = null;
        Node previous = null;
        Map<Node , Node> hm = new HashMap<>();
        while(curr != null){
        Node new_node = new Node(curr.val);
        hm.put(curr,new_node);
        if(previous == null) res = new_node;
        else{
            previous.next = new_node;
            
        }
        previous = new_node;
        curr = curr.next;


        }
        curr = head;
        Node temp = res;
        while(curr != null){
            temp.random = hm.get(curr.random);
            temp = temp.next;
            curr = curr.next;
        }
    return res;
        
    }
}