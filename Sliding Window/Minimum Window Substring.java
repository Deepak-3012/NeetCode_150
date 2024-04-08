class Solution {
    public String minWindow(String s, String t) {
        //TC  -> O(n + m)
        //SC  -> O(n)
        int [] arr = new int [128];
        char [] s_arr = s.toCharArray();
        char [] t_arr = t.toCharArray();
        for(char x : t_arr){
            arr[x]++;
        }
        int counter = 0; int minLen = Integer.MAX_VALUE;
        int left =  0; int right = 0;
        String ans = "";
        while(right < s_arr.length){
            char curr = s_arr[right];
            if(--arr[curr] >= 0){
                counter += 1;
            }
            while(counter == t_arr.length){
                int windowLen = right - left + 1;
                if(windowLen < minLen){
                    minLen = windowLen;
                    ans = s.substring(left , right + 1);
                }
                char leftval = s_arr[left];
                if(++arr[leftval] > 0){
                    counter --;
                }
                left ++;
            }
            right++;

        }
        return ans;
    }
}