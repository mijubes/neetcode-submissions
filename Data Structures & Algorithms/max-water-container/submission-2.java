class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        int left = 0;
        int right = heights.length-1;
        while(left<=right) {
            if(max<Math.min(heights[left],heights[right])*(right-left))
                max = Math.min(heights[left],heights[right])*(right-left);
            if(heights[left]<heights[right])
                left++;
            else if(heights[right]<heights[left])
                right--;
            else {
                left++;
                right--;
            }
        }
        return max;
    }
}
