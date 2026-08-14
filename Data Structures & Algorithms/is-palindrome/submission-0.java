class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0;
        int right = s.length()-1;
        while(left<=right) {
            char l = s.charAt(left);
            char r = s.charAt(right);
            if(!Character.isLetterOrDigit(l))
                left++;
            else if(!Character.isLetterOrDigit(r))
                right--;
            else if(l!=r)
                return false;
            else {
                left++;
                right--;
            }
        }
        return true;

        //String[] temp = s.toLowerCase().split("\\s+");
        //return s.toLowerCase().equals(reversed.toLowerCase());
        //for(int a=0;a<nums.length)
        //Reverses a string
        //String reversed = new StringBuilder(s).reverse().toString();
    }
}
