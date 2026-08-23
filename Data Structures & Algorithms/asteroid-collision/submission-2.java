class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> right = new Stack<Integer>();
        for(int a=0;a<asteroids.length;a++) {
            if(asteroids[a]>0 || right.isEmpty()) 
                right.push(asteroids[a]);
            else {
                int val = right.peek();
                while(val>0 && !right.isEmpty() && val<Math.abs(asteroids[a])) {
                    right.pop();
                    if(!right.isEmpty())
                        val = right.peek();
                    System.out.println(val);
                }
                if(right.isEmpty() || val<0)
                    right.push(asteroids[a]);
                else if(val==Math.abs(asteroids[a]))
                    right.pop();  
            }
        }
        int[] ans = new int[right.size()];
        int index = right.size()-1;
        while(!right.isEmpty()) {
            ans[index] = right.pop();
            index--;
        }
        return ans;
    }
}