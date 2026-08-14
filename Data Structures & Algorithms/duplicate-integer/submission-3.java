class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
        
        /*Arrays.sort(nums);
        for(int a=0;a<nums.length-1;a++) {
            if(nums[a]==nums[a+1])
                return true;
        }
        return false;*/

        //45% runtime
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