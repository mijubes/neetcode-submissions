class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = 0;
        for(int a=0;a<nums1.length;a++) {
            if(nums1[a]==0 && index<nums2.length) {
                nums1[a] = nums2[index];
                index++;
            }
        }
        Arrays.sort(nums1);
    }
}