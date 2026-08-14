class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> map = new ArrayList<Integer>();
        for(int a=0;a<nums.length;a++)
            if(!map.contains(nums[a]))
                map.add(nums[a]);

        for(int b=0;b<map.size();b++)
            nums[b] = map.get(b);
        return map.size();
    }
}