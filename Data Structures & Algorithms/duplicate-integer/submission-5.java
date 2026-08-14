class Solution {
    public boolean hasDuplicate(int[] nums) {
        //45% runtime
        Arrays.sort(nums);
        for(int a=0;a<nums.length-1;a++) {
            if(nums[a]==nums[a+1])
                return true;
        }
        return false;

        //25% runtime
        /*HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int a=0;a<nums.length;a++) {
            if(map.containsKey(nums[a]))
                return true;
            else
                map.put(nums[a],1);
        }
        return false;*/
    }
}