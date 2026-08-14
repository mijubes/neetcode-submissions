class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int a=0;a<nums.length;a++) {
            if(map.containsKey(nums[a]))
                return true;
            else
                map.put(nums[a],1);
        }
        return false;
    }
}