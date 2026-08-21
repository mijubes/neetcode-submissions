class Solution {
    public String decodeString(String s) {
        String output = "";
        Stack<String> stack = new Stack<String>();
        for(int a=0;a<s.length();a++) {
            if(!s.substring(a,a+1).equals("]"))
                stack.push(s.substring(a,a+1));
            else {
                String ans = "";
                String line = "";
                while(!stack.peek().equals("[")) {
                    line = stack.pop() + line;
                }
                stack.pop();
                String numStr = "";
                //Chat code
        while(!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0))) {
            numStr = stack.pop() + numStr;
        }
                int mult = Integer.parseInt(numStr);
                for(int b=0;b<mult;b++)
                    ans+=line;
                stack.push(ans);
            }
        }
        while(!stack.isEmpty()){
            output = stack.pop() + output;
        }
        return output;
    }
}