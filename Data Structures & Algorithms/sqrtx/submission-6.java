class Solution {
    public int mySqrt(int x) {
        if(x==1)
            return 1;
        
        long val = 0;
        while((val*val)<x) {
            val++;
        }
        if(val*val==x)
            return (int)(val);
        else
            return (int)(val)-1;
    }
}