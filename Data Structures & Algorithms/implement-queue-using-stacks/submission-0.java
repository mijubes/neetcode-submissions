class MyQueue {
    Stack<Integer> stack;
    public MyQueue() {
        stack = new Stack<Integer>();
    }
    
    public void push(int x) {
        stack.push(x);
    }
    
    public int pop() {
        Stack<Integer> temp = new Stack<Integer>();
        while(!stack.isEmpty()) {
            temp.push(stack.pop());
        }
        int val = temp.pop();
        while(!temp.isEmpty()) {
            stack.push(temp.pop());
        }
        return val;
    }
    
    public int peek() {
        Stack<Integer> temp = new Stack<Integer>();
        while(!stack.isEmpty()) {
            temp.push(stack.pop());
        }
        int val = temp.peek();
        while(!temp.isEmpty()) {
            stack.push(temp.pop());
        }
        return val;
    }
    
    public boolean empty() {
        return stack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */