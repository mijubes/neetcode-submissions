class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int a=0;a<nums.length;a++) {
            if(map.containsKey(nums[a])) {
                if(Math.abs(map.get(nums[a])-a)<=k)
                    return true;
                else
                    map.put(nums[a],a);
            }
            else
                map.put(nums[a],a);
        }
        return false;
    }
}