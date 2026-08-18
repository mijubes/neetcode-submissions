class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<Integer>();
        List<Integer> temp = new ArrayList<Integer>();
        for(int a=0;a<arr.length;a++)
            temp.add(arr[a]);
        
        int index = 0;
        while(k>0) {
            int max = Math.abs(temp.get(0)-x);
            for(int a=1;a<temp.size();a++)
                if(Math.abs(temp.get(a)-x)<max) {
                    max = Math.abs(temp.get(a)-x);
                    index = a;
                }
            ans.add(temp.get(index));
            temp.remove(index);
            index = 0;
            k--;
        }
        Collections.sort(ans);
        return ans;
    }
}