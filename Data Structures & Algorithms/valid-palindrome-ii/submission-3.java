class Solution {
    public boolean validPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0;
        int right = s.length()-1;
        boolean count = true;
        while(left<=right) {
            char l = s.charAt(left);
            char r = s.charAt(right);
            if(!Character.isLetterOrDigit(l))
                left++;
            else if(!Character.isLetterOrDigit(r))
                right--;
            if (l != r) {
                //Chat code
    return isPalindromeRange(s, left + 1, right) || isPalindromeRange(s, left, right - 1);
}
            else {
                left++;
                right--;
            }
        }
        return true;
    }
    //chat code
    private boolean isPalindromeRange(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}