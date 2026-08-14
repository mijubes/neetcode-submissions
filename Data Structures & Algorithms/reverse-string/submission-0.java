class Solution {
    public void reverseString(char[] s) {
        for(int a=0;a<s.length/2;a++) {
            char temp = s[a];
            s[a] = s[s.length-a-1];
            s[s.length-a-1] = temp;
        }
    }
}