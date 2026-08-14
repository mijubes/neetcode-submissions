class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> map = new ArrayList<Integer>();
        for(int a=0;a<operations.length;a++)
            if(operations[a].equals("+"))
                map.add(map.get(map.size()-1)+map.get(map.size()-2));
            else if(operations[a].equals("D"))
                map.add(map.get(map.size()-1)*2);
            else if(operations[a].equals("C"))
                map.remove(map.get(map.size()-1));
            else
                map.add(Integer.parseInt(operations[a]));
        
        int sum = 0;
        for(int a=0;a<map.size();a++)
            sum+=map.get(a);
        return sum;
    }
}