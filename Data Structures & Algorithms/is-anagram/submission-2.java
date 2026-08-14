class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        
        HashMap<String,Integer> smap = new HashMap<String,Integer>();
        HashMap<String,Integer> tmap = new HashMap<String,Integer>();
        for(int a=0;a<s.length();a++) {
    smap.put(s.substring(a,a+1),smap.getOrDefault(s.substring(a,a+1),0)+1);
    tmap.put(t.substring(a,a+1),tmap.getOrDefault(t.substring(a,a+1),0)+1);
        }
        return smap.equals(tmap);
    }
}
