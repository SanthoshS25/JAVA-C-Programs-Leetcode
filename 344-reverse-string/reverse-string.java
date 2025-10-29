class Solution {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while (start < end) {
            // Swap characters at start and end pointers
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            // Move pointers towards the center
            start++;
            end--;
        }
        System.out.print(s);
        
    }
}