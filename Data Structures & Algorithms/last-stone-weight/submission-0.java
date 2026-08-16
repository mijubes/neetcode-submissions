class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> map = new ArrayList<Integer>();
        Arrays.sort(stones);
        for(int a=0;a<stones.length;a++)
            map.add(stones[a]);
        
        while(map.size()>1) {
            Collections.sort(map);
            if(map.size()>1){
                int val = map.get(map.size()-1)-map.get(map.size()-2);
                map.remove(map.size()-1);
                map.remove(map.size()-1);
                map.add(val);
            } 
        }
        
        if(map.size()==0)
            return 0;
        else
            return map.get(0);
    }
}
