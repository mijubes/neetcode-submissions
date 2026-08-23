class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(int a=0;a<s1.length();a++) {
            String val = String.valueOf((s1.charAt(a)));
            map.put(val,map.getOrDefault(val,0)+1);
        }
        
        int left = 0 ;
        int right = s1.length();
        while(right<=s2.length()) {
            HashMap<String,Integer> map2 = new HashMap<String,Integer>();
            for(int a=left;a<right;a++) {
                String val = s2.substring(a,a+1);
                map2.put(val,map2.getOrDefault(val,0)+1);
                //System.out.println(val+" "+map2.get(val));
            }
            if(map2.size()==map.size()) {
                boolean same = true;
                for(int a=0;a<s1.length();a++) {
                    String val = s1.substring(a,a+1);
        //System.out.println(val+" "+map.get(val)+" "+map2.get(val));
                    if(map.get(val)!=map2.get(val))
                        same = false;
                }
                if(same)
                    return true;
            }
            left++;
            right++;
            System.out.println();
        }
        return false;
    }
}
