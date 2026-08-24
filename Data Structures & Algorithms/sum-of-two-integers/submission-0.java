class Solution {
    public int getSum(int a, int b) {
        //Chat code
        while(b!=0) {
            int c = (a&b);
            a = a^b;
            b = c<<1;
            //System.out.println(a+" "+b);
            //System.out.println(a);
        }
        return a;
    }
}
