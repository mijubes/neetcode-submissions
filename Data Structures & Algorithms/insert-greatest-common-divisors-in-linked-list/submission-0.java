/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode dummy = new ListNode(0,head);
        ListNode cur = dummy;
        cur = cur.next;
        while(cur.next!=null) {
            ListNode temp = cur.next;
            int divisor = gcd(cur.val,cur.next.val);
            ListNode prev = new ListNode(divisor);
            prev.next = temp;
            cur.next = prev;
            cur = cur.next.next;

        }
        return dummy.next;
    }
    public int gcd(int one, int two) {
        int start = Math.min(one,two);
        while(start>0) {
            if(one%start==0 && two%start==0)
                return start;
            start--;
        }
        return 1;
    }
}