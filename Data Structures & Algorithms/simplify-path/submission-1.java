class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<String>();
        String[] paths = path.split("/");
        stack.push("/");
        
        for(int a=0;a<paths.length;a++) {
            if(paths[a].equals("..")) {
                if(stack.size()!=1) {
                    stack.pop();
                    stack.pop();
                }
            }
            else if(paths[a].length()>0 && !paths[a].equals(".")) {
                stack.push(paths[a]);
                stack.push("/");
            }
        }
        
        String output = "";
        int len = stack.size();
        for(int a=0;a<len;a++)
            output = stack.pop()+output;

        if(output.length()>1)
            return output.substring(0,output.length()-1);
        else
            return output;
    }
}