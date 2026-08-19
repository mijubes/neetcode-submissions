class Solution {
    public int reverse(int x) {
        boolean neg = x < 0;
        long xLong = Math.abs((long) x);
        long pow = String.valueOf(xLong).length();
        long ans = 0;
        while(xLong>0) {
            ans+=(Math.pow(10,pow-1))*(xLong%10);
            pow--;
            xLong/=10;
        }
        if(ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE)
            return 0;
        if(neg)
            ans = 0-ans;
        return (int)(ans);
    }
}
