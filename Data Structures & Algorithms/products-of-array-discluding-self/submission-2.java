class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0] = 1;
        int val = 1;
        for(int a=1;a<nums.length;a++) {
            val*=nums[a-1];
            prefix[a] = val;
        }
        
        int[] suffix = new int[nums.length];
        suffix[nums.length-1] = 1;
        int num = 1;
        for(int a=nums.length-2;a>=0;a--) {
            num*=nums[a+1];
            suffix[a] = num;
        }
        
        int[] ans = new int[nums.length];
        for(int a=0;a<nums.length;a++)
            ans[a]=prefix[a]*suffix[a];
        return ans;
    }
}  
