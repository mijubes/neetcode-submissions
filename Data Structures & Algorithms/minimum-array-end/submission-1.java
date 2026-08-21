class Solution {
    public long minEnd(int n, int x) {
        //Chat code
        long val = x;
        for(int a=1;a<n;a++)
            val = (val+1)|x;
        return val;
    }
}