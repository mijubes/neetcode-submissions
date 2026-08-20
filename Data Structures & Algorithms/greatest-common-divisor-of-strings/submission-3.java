class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String output = "";
        if(str1.length()>str2.length()) {
            for(int a=1;a<=str2.length();a++) {
                String c = str2.substring(0,a);
                if(str2.length()%c.length()==0 && str1.length()%c.length()==0) {
                    boolean same = true;
                    for(int b=0;b<str1.length();b+=a) {
                        if(!str1.substring(b,b+a).equals(c)) {
                            same = false;
                            break;
                        }
                    }
                    if(same && output.length()<c.length())
                        output = c;
                }
            }
        }
        else {
            for(int a=1;a<=str1.length();a++) {
                String c = str1.substring(0,a);
                if(str1.length()%c.length()==0 && str2.length()%c.length()==0) {
                    boolean same = true;
                    for(int b=0;b<str2.length();b+=a) {
                        if(!str2.substring(b,b+a).equals(c)) {
                            same = false;
                            break;
                        }
                    }
                    if(same && output.length()<c.length())
                        output = c;
                }
            }
        }
        return output;
    }
}