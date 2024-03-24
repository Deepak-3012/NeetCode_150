class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // TC -> O(n)
        // SC -> O(n)
        Stack<Integer> st = new Stack<>();
        int n = temperatures.length;
        int[] res = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            // By default array elements are intialized with 0 in java

            while (!st.isEmpty() && temperatures[i] >= temperatures[st.peek()]) {
                st.pop();
            }
            if (!st.isEmpty() && temperatures[i] < temperatures[st.peek()]) {
                res[i] = st.peek() - i;
            }

            st.push(i);
        }
        return res;
    }
}