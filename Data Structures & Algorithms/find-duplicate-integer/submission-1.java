class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int a=0;a<nums.length-1;a++)
            if(nums[a]==nums[a+1])
                return nums[a];
        return nums[nums.length-1];
    }
}
