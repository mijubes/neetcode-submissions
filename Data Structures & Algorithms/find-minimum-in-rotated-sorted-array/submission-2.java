class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int mid = low+(high-low)/2;
        int min = nums[0];

        while(low<=high) {
            mid = low+(high-low)/2;
            if(nums[low]>nums[high]) {
                if(nums[mid]>nums[high])
                    low++;
                else
                    high--;
            }
            else {
                if(nums[mid]>Integer.MIN_VALUE)
                    high = mid-1;
                else
                    low = mid+1;
            }
            min = Math.min(min,nums[low]);
        }
        return min;
    }
}
