class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int min = nums.length+1;
        for(int right=0;right<nums.length;right++) {
            sum+=nums[right];
            while(sum>=target) {
                min = Math.min(min,right-left+1); 
                sum-=nums[left];
                left++;
                //System.out.println(sum);
                //System.out.println(left+" "+right);
            }
        }
        if(min>nums.length)
            return 0;
        else
            return min;
    }
}