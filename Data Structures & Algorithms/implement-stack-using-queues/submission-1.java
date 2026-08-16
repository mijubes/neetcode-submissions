class MyStack {
    Queue<Integer> queue;
    public MyStack() {
        queue = new LinkedList<>();
    }
    
    public void push(int x) {
        queue.offer(x);
    }
    
    public int pop() {
        Queue<Integer> temp = new LinkedList<>();
        int val = 0;
        while(queue.size() > 1) {
            temp.offer(queue.poll());
        }
        val = queue.poll();
        while(!temp.isEmpty()) {
            queue.offer(temp.poll());
        }
        return val;
    }
    
    public int top() {
        Queue<Integer> temp = new LinkedList<>();
        int val = 0;
        while(!queue.isEmpty()) {
            val = queue.peek();
            temp.offer(queue.poll());
        }
        while(!temp.isEmpty()) {
            queue.offer(temp.poll());
        }
        return val;
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */