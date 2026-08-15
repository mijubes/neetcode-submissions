class MinStack {
    ArrayList<Integer> map;
    public MinStack() {
        map = new ArrayList<Integer>();
    }
    
    public void push(int val) {
        map.add(val);
    }
    
    public void pop() {
        map.remove(map.size()-1);
    }
    
    public int top() {
        return map.get(map.size()-1);
    }
    
    public int getMin() {
        int min = map.get(0);
        for(int a=1;a<map.size();a++)
            if(map.get(a)<min)
                min = map.get(a);
        return min;
    }
}
