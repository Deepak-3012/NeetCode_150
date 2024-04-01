class TimeMap {
    // TC -> O(log n)
    // SC -> O(m*k) m is unique no of keys and k is the no of values associated with it
    static class Pair{
        String key;
        int value;
        public Pair(String key , int value){
            this.key = key;
            this.value = value;
        }
    }
    HashMap<String , ArrayList<Pair>> hm;
    public TimeMap() {
        hm = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(hm.containsKey(key)){
           hm.get(key).add( new Pair(value , timestamp)); 
        }
        else{
            ArrayList<Pair> arr =new ArrayList();
            arr.add(new Pair(value,timestamp));
            hm.put(key,arr);
        }
        
    }
    
    public String get(String key, int timestamp) {
        if(!hm.containsKey(key)){
            return "";
        }
        ArrayList<Pair> al = hm.get(key);
        int left = 0; int right = al.size() - 1;
        String ans = "";
        while(left <= right){
            int mid = (left + right) / 2;
            int timeval = al.get(mid).value;
            if(timeval == timestamp){
                return al.get(mid).key;
            }
            else if(timeval > timestamp){
                right = mid - 1;
            }
            else{
                ans = al.get(mid).key;
                left = mid + 1;
            }

        }
        return ans;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */