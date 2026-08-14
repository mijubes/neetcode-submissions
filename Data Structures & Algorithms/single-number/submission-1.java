class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int a=0;a<nums.length;a++)
            ans^=nums[a];
        return ans;

        //13.81 runtime (nlogn runtime)
        /*Arrays.sort(nums);
        for(int a=0;a<nums.length-1;a+=2) {
            if(nums[a]!=nums[a+1])
                return nums[a];
        }
        return nums[nums.length-1];*/
    }
}
