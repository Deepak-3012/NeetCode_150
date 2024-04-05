class Solution {
    public int characterReplacement(String s, int k) {
        //TC -> O(n)
        //SC -> O(1) // array is used but it's size is fixed
        int left = 0;
        int right = 0;
        int maxFreq = 0;
        int maxLength = 0;
        int[] hash = new int[26];
        while (right < s.length()) {
            hash[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq, hash[s.charAt(right) - 'A']);
            if (((right - left + 1) - maxFreq) > k) {
                hash[s.charAt(left) - 'A']--;
                left++; 
            }
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
        return maxLength;

    }
}