class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        for(int a=0;a<32;a++) {
            if((n&1)==1)
                count++;
            n>>=1;
        }
        return count;
    }
}
