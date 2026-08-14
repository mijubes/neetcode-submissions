class KthLargest {
    ArrayList<Integer> map;
    int size;
    public KthLargest(int k, int[] nums) {
        map = new ArrayList<Integer>();
        for(int a=0;a<nums.length;a++)
            map.add(nums[a]);
        size = k;
    }
    
    public int add(int val) {
        map.add(val);
        Collections.sort(map);
        return map.get(map.size()-size);
    }
}
