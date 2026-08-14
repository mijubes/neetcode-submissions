class Solution {
    public int[] plusOne(int[] digits) {
        boolean carry = false;
        for(int a=digits.length-1;a>=0;a--) {
            if(a==digits.length-1) {
                if(digits[a]==9) {
                    digits[a] = 0;
                    carry = true;
                    //System.out.println(digits[a]);
                }
                else
                    digits[a]++;
            }
            else if(carry) {
                if(digits[a]+1>=10) {
                    carry = true;
                    digits[a] = (digits[a]+1)%10;
                    //System.out.println(digits[a]+" "+a);
                }
                else {
                    digits[a]++;
                    carry = false;
                }
            }
            //System.out.println(digits[a]);
        }

        int[] ans;
        if(carry)
            ans = new int[digits.length+1];
        else
            ans = new int[digits.length];
        
        for(int a=digits.length-1;a>=0;a--) {
            ans[a] = digits[a];
        }
        if(carry)
            ans[0] = 1;
        return ans;
    }
}
