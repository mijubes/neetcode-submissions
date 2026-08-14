class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int one = 0;
        int two = 1;
        while(nums[one]+nums[two]!=target) {
            if(two+1==nums.length) {
                one++;
                two = one+1;
            }
            else
                two++;
            if(nums[one]+nums[two]==target) {
                ans[0] = one;
                ans[1] = two;
                return ans;
            }
        }
        ans[0] = one;
        ans[1] = two;
        return ans;
    }
}
