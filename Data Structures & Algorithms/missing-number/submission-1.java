class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int a=0;a<nums.length;a++)
            if(nums[a]!=a)
                return a;
        return nums.length;
    }
}
