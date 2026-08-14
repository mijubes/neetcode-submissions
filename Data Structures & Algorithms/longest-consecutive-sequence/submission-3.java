class Solution {
    public int longestConsecutive(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int a=0;a<nums.length;a++)
            set.add(nums[a]);
        
        int max = 0;
        int count = 0;
        int temp = 0;
        for (int val : set) {
            if(count==0) {
                temp = val;
                count = 1;
                max = 1;
            }
            else if(val-temp==1) {
                temp = val;
                count++;
            }
            else {
                if(count>max)
                    max = count;
                temp = val;
                count = 1;
            }
        }
        if(count>max)
            max = count;
        return max;

        /*if(nums.length<2)
            return nums.length;
            
        Arrays.sort(nums);
        int max = 0;
        int start = 0;
        int end = 1;
        for(int a=1;a<nums.length;a++) {
            if(nums[a]-nums[a-1]>1) {
                if(a==0)
                    start = 0;
                else
                    start = a;
            }
            else {
                end = a;
                if(end-start>max)
                    max = end-start+1;
            }
        }
        if(end-start>max)
            max = end-start+1;
        return max;*/
    }
}
