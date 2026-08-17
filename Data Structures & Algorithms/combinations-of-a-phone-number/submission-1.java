class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<String,String> map = new HashMap<String,String>();
        List<String> ans = new ArrayList<String>();
        map.put("2","abc");
        map.put("3","def");
        map.put("4","ghi");
        map.put("5","jkl");
        map.put("6","mno");
        map.put("7","pqrs");
        map.put("8","tuv");
        map.put("9","wxyz");

        for(int a=0;a<digits.length();a++) {
            String val = digits.substring(a,a+1);
            if(ans.size()==0) {
                for(int b=0;b<map.get(val).length();b++) {
                    ans.add(map.get(val).substring(b,b+1));
                }
            }
            else {
                int len = ans.size();
                for(int z=0;z<len;z++) {
                    String temp = ans.remove(0);
                    //System.out.println(temp);
                    for(int b=0;b<map.get(val).length();b++)
                        ans.add(temp+map.get(val).charAt(b));
                }
            }
        }
        return ans;
    }
}
