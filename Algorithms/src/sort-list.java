/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode middle = head;
        ListNode end = head;
        ListNode prev = null;

        while(end != null && end.next != null) {
            prev = middle;
            middle = middle.next;
            end = end.next.next;
        }
        //break the original list into 2 list
        prev.next = null;

        ListNode l1 = sortList(head);
        ListNode l2 = sortList(middle);

        return mergeList(l1, l2);
    }

    public ListNode mergeList(ListNode l1, ListNode l2) {
        ListNode l = new ListNode(0), p = l;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }

        if (l1 != null)
            p.next = l1;

        if (l2 != null)
            p.next = l2;

        return l.next;
    }
}
