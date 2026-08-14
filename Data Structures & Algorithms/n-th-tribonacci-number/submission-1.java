class Solution {
    public int tribonacci(int n) {
        int[] map = new int[38];
        for(int a=0;a<=n;a++) {
            if(a==0)
                map[a] = 0;
            else if(a==1)
                map[a] = 1;
            else if(a==2)
                map[a] = 1;
            else
                map[a] = map[a-1]+map[a-2]+map[a-3];
        }
        return map[n];
    }
}