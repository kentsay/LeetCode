/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        int carry = 0;
        ListNode newHead = new ListNode(0);
        ListNode temp = newHead;
        while(l1 != null || l2 != null) {
            if (l1 != null) {
                carry += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                carry += l2.val;
                l2 = l2.next;
            }
            if (carry >= 10) temp.next = new ListNode(carry-10);
            else temp.next = new ListNode(carry);
            temp = temp.next;
            carry = (carry/10 > 0)? 1: 0;
        }
        if (carry == 1)
            temp.next = new ListNode(1);
        return newHead.next;
    }
}
