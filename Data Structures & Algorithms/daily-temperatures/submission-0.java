class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        for(int a=0;a<temperatures.length;a++) {
            int count = 0;
            for(int b=a+1;b<temperatures.length;b++)
                if(temperatures[b]>temperatures[a]) {
                    ans[a] = b-a;
                    break;
                }
        }
        return ans;
    }
}
