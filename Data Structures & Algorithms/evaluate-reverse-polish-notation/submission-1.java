class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> map = new Stack<Integer>();
        for(int a=0;a<tokens.length;a++) {
            String c = tokens[a];
            System.out.println(c);
            if(c.equals("+")) {
                int one = map.pop();
                int two = map.pop();
                map.push(two+one);
            }
            else if(c.equals("-")) {
                int one = map.pop();
                int two = map.pop();
                map.push(two-one);
            }
            else if(c.equals("*")) {
                int one = map.pop();
                int two = map.pop();
                map.push(two*one);
            }
            else if(c.equals("/")) {
                int one = map.pop();
                int two = map.pop();
                map.push(two/one);
            }
            else
                map.push(Integer.parseInt(c));
        }
        return map.pop();
    }
}
