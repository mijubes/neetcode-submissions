class Solution {
    public String addBinary(String a, String b) {
        long one = Long.parseLong(a, 2);
        long two = Long.parseLong(b, 2);
        long three = one+two;
        return Long.toBinaryString(three);
    }
}