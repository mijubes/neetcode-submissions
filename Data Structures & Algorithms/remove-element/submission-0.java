class Solution {
    public int removeElement(int[] nums, int val) {
        int[] temp = new int[nums.length];
        int index = 0;
        for(int a=0;a<nums.length;a++)
            if(nums[a]!=val) {
                temp[index] = nums[a];
                index++;
            }
        for(int a=0;a<nums.length;a++)
            nums[a] = temp[a];
        return index;
    }
}