class Solution {

    public String encode(List<String> strs) {
        String code = "";
        for(int a=0;a<strs.size();a++) {
            code+=strs.get(a).length()+"#"+strs.get(a);
        }
        //System.out.println(code);
        return code;
    }

    public List<String> decode(String str) {
        List<String> temp = new ArrayList<>();
        int i = 0;
        while(i<str.length()) {
            int index = str.indexOf("#");
            int count = Integer.parseInt(str.substring(0,index));
            temp.add(str.substring(index+1,index+count+1));
            str = str.substring(index+count+1);
        }
        return temp;
    }
}
