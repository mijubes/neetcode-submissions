class Solution {
    public int jump(int[] nums) {
        int count = 0;
        int step = 0;
        while(step<nums.length-1) {
            int max = nums[step];
            int index = 0;
            for(int a=step;a<Math.min(nums.length,step+max);a++)
                if(nums[a]>index) {
                    index = nums[a];
                }
                if(index == 0) {
                    count++;
                    break;
                }
            count++;
            step+=index;
        }
        return count;
    }
}
