class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        for(int a=0;a<nums.length;a++) {
            ans[a] = nums[a];
            ans[a+nums.length] = nums[a];
        }
        return ans;
    }
}