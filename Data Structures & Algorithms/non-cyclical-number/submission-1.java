class Solution {
    public boolean isHappy(int n) {
        int sum = n;
        ArrayList<Integer> map = new ArrayList<Integer>();
        while(sum!=1) {
            int temp = 0;
            while(sum>0) {
                temp+=(int)(Math.pow(sum%10,2));
                sum/=10;
            }
            if(map.contains(temp))
                return false;
            map.add(temp);
            sum = temp;
            //System.out.println(sum);
        }
        return true;
    }
}
