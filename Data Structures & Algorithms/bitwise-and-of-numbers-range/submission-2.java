class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        long val = left;
        for(long a=left+1;a<=right;a++) {
            //System.out.println(a);
            if(val==0)
                return 0;
            else
                val&=a;
        }
        return (int)(val);
    }
}