class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int a=0;a<nums.length;a++) {
            map.put(nums[a],map.getOrDefault(nums[a],0)+1);
        }
        
        int[] ans = new int[k];
        int index = 0;
        int max = 0;
        int val = 0;
        while(k>0) {
            for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if(entry.getValue()>max) {
                    max = entry.getValue();
                    val = entry.getKey();
                }
            }
            map.remove(val);
            ans[index] = val;
            index++;
            max = 0;
            k--;
        }
        Arrays.sort(ans);
        return ans;
    }
}
