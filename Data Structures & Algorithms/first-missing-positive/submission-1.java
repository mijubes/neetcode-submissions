class Solution {
    public int firstMissingPositive(int[] nums) {
        int max = 0;
        for(int a=0;a<nums.length;a++) {
            max = Math.max(max,nums[a]);
            if(nums[a]<nums.length && nums[a]>=1) {
                int val = nums[nums[a]-1];
                nums[nums[a]-1] = nums[a];
                nums[a] = val;
            }
        }
        for(int a=0;a<nums.length;a++)
            if(nums[a]<nums.length && nums[a]>=1) {
                int val = nums[nums[a]-1];
                nums[nums[a]-1] = nums[a];
                nums[a] = val;
            }

        int index = 0;
        for(int a=1;a<=max;a++) {
            if(nums[index]!=a)
                return a;
            else
                index++;
        }
        return max+1;
    }
}