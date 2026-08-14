class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int a=0;a<nums.length;a++)
            map.put(nums[a],map.getOrDefault(nums[a],0)+1);
        
        int index = 0;
        if(map.containsKey(0))
            for(int a=0;a<map.get(0);a++)
                nums[index++] = 0;
        if(map.containsKey(1))
            for(int a=0;a<map.get(1);a++)
                nums[index++] = 1;
        if(map.containsKey(2))
            for(int a=0;a<map.get(2);a++)
                nums[index++] = 2;
    }
}