class Solution {
    public double myPow(double x, int n) {
        if(x==1 || n==0 || (x==-1 && (n%2==0)))
            return 1;
        if(x==-1 && (Math.abs(n)%2==1))
            return -1;
        if(Math.abs(x)!=1 && (long)(n) >= Integer.MAX_VALUE || (long)(n) <= Integer.MIN_VALUE)
            return 0;
        
        double ans = 1;
        if(n>=0) {
            for(int a=0;a<n;a++)
                ans*=x;
        }
        else {
            for(int a=n;a<0;a++)
                ans/=x;
        }
        return ans;
    }
}
