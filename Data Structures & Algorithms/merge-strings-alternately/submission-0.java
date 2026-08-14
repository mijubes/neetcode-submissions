class Solution {
    public String mergeAlternately(String word1, String word2) {
        int one = 0;
        int two = 0;
        String output = "";
        while(one<word1.length() && two<word2.length()) {
            output+=word1.charAt(one);
            output+=word2.charAt(two);
            one++;
            two++;
        }
        output+=word1.substring(one)+word2.substring(two);
        return output;
    }
}