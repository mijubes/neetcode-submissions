class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String output = "";
        for(int a=0;a<Math.min(strs[0].length(),strs[strs.length-1].length());a++) {
            if(strs[0].charAt(a)==strs[strs.length-1].charAt(a))
                output+=strs[0].charAt(a);
            else
                break;
        }
        return output;
    }
}