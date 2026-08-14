class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> map = new ArrayList<Integer>();
        Arrays.sort(nums);
        for(int a=0;a<nums.length-(nums.length)/3;a++) {
            if(nums[a]==nums[a+(nums.length)/3] && !map.contains(nums[a]))
                map.add(nums[a]);
        }
        return map;
    }
}