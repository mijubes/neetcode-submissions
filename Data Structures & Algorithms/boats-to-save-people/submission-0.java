class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count = 0;
        int left = 0;
        int right = people.length-1;
        while(left<=right) {
            if(people[right]+people[left]<=limit)
                left++;
            right--;
            count++;
        }
        return count;
    }
}