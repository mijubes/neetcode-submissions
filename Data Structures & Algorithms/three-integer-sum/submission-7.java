class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //Chat code
        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);
        for(int a=0;a<nums.length-2;a++) {
            if(nums[a]<=0) {
                for(int b=a+1;b<nums.length-1;b++) {
                    if(nums[a]+nums[b]<=0) {
                        int target = 0-(nums[a]+nums[b]);
                        int low = b+1;
                        int high = nums.length-1;
                        int c = low+(high-low)/2;
                        while(low<=high) {
                            c = low+(high-low)/2;
                            if(nums[a]+nums[c]+nums[b]==0) {
                                List<Integer> tmp = Arrays.asList(nums[a], nums[b], nums[c]);
                                res.add(tmp);
                                break;
                            }
                            else if(nums[c]>target)
                                high = c-1;
                            else
                                low = c+1;
                        }
                    }
                    else
                        break;
                }
            }
            else
                break;
        }
        return new ArrayList<>(res);
    }
}
