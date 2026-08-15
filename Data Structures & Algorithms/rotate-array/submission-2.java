class Solution {
    public void rotate(int[] nums, int k) {
        int[] ans = new int[nums.length];
        int index = 0;
        for(int a=nums.length-(k%nums.length);a<nums.length;a++)
            ans[index++] = nums[a];
        for(int a=0;a<nums.length-(k%nums.length);a++)
            ans[index++] = nums[a];
        for(int a=0;a<nums.length;a++)
            nums[a] = ans[a];
    }
}