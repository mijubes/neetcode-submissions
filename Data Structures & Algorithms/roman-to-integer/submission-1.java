class Solution {
    public int romanToInt(String s) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        map.put("M",1000);
        map.put("CM",900);
        map.put("D",500);
        map.put("CD",400);
        map.put("C",100);
        map.put("XC",90);
        map.put("L",50);
        map.put("XL",40);
        map.put("X",10);
        map.put("IX",9);
        map.put("V",5);
        map.put("IV",4);
        map.put("I",1);

        int sum = 0;
        for(int a=0;a<s.length();a++) {
            if(a<s.length()-1 && map.containsKey(s.substring(a,a+2))) {
                sum+=map.get(s.substring(a,a+2));
                a++;
            }
            else if(map.containsKey(s.substring(a,a+1)))
                sum+=map.get(s.substring(a,a+1));
        }
        return sum;
    }
}