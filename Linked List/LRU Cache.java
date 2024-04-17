class LRUCache {
    //TC -> O(1)
    //SC -> O(n)
    Node head = new Node(0,0);
    Node tail = new Node(0,0);
    Map<Integer, Node> mp = new HashMap<>();
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;; 
    }
    
    public int get(int key) {
        if(mp.containsKey(key))
        {
            Node node = mp.get(key);
            remove(node);
            insert(node);
            return node.value;
        }
        else{
            return -1;
        }     
    }
    
    public void put(int key, int value) {
       if(mp.containsKey(key))
       remove(mp.get(key));
       if(mp.size() == capacity)
       remove(tail.prev);
       insert(new Node(key , value));
        
    }
    public void insert(Node node){
        mp.put(node.key, node); 
        Node headNext = head.next;
        head.next = node;
        node.prev = head;
        headNext.prev = node;
        node.next = headNext;
       
    
    }
    public void remove(Node node){
        mp.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    // doubly linked list implementation
    class Node {
        Node prev; Node next;
        int key; int value;
        Node(int key , int value){
            this.key = key;
            this.value = value;
        }
    }
}

