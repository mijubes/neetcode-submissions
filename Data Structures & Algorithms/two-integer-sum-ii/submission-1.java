class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        for(int a=0;a<numbers.length;a++) {
            int val = binarySearch(numbers,target-numbers[a]); 
            if(val!=-1) {
                ans[0] = a+1;
                if(a!=val)
                    ans[1] = val+1;
                else if(val>0 && numbers[val-1]==target-numbers[a])
                    ans[1] = val;
                else if(val<numbers.length-1 && numbers[val+1]==target-numbers[a])
                    ans[1] = val+2;
                return ans;
            }
        }
        return ans;
    }
    public int binarySearch(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length-1;
        int mid = low+(high-low)/2;

        while(low<=high) {
            mid = low+(high-low)/2;
            if(numbers[mid]==target)
                return mid;
            else if(numbers[mid]>target)
                high = mid-1;
            else
                low = mid+1;
        }
        return -1;
    }
}
