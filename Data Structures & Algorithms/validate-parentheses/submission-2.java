class Solution {
    public boolean isValid(String s) {
        Stack<Character> map = new Stack<Character>();
        for(int a=0;a<s.length();a++) {
            Character val = s.charAt(a);
            if(val=='[')
                map.push('[');
            else if(val=='(')
                map.push('(');
            else if(val=='{')
                map.push('{');
            else if(val==']') {
                if(map.size()>0 && map.peek()=='[')
                    map.pop();
                else
                    return false;
            }
            else if(val==')') {
                if(map.size()>0 && map.peek()=='(')
                    map.pop();
                else
                    return false;
            }
            else if(val=='}') {
                if(map.size()>0 && map.peek()=='{')
                    map.pop();
                else
                    return false;
            }
        }
        if(map.size()!=0)
            return false;
        else
            return true;
    }
}
