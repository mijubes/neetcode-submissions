class Solution {
    public boolean lemonadeChange(int[] bills) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int a=0;a<bills.length;a++) {
            if(bills[a]!=5) {
                if(bills[a]==10 && map.containsKey(5) && map.get(5)>0) {
                    map.put(5,map.get(5)-1);
                    map.put(10,map.getOrDefault(10,0)+1);
                }
                else if(bills[a]==20) {
                    if((map.containsKey(5) && map.get(5)>0 && map.containsKey(10) && map.get(10)>0)) {
                        map.put(5,map.get(5)-1);
                        map.put(10,map.get(10)-1);
                    }
                    else if((map.containsKey(5) && map.get(5)>=3)) {
                        map.put(5,map.get(5)-3);
                    }
                    else
                        return false;
                }
                else
                    return false;
            }
            else
                map.put(5,map.getOrDefault(5,0)+1);
            //System.out.println(bills[a]);
        }
        return true;
    }
}