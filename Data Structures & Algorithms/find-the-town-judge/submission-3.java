class Solution {
    public int findJudge(int n, int[][] trust) {
        HashMap<Integer,Integer> one = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> two = new HashMap<Integer,Integer>();
        for(int a=0;a<trust.length;a++) {
            one.put(trust[a][0],1);
            two.put(trust[a][1],two.getOrDefault(trust[a][1],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:two.entrySet()) {
            if(entry.getValue()==one.size())
                return entry.getKey();
        }
        return -1;
        
        /*for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue()==entry.getKey() && entry.getValue()==trust.length)
                return entry.getKey();
        }*/
    }
}