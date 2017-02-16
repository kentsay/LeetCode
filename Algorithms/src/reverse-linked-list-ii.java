/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
     ListNode preHead = new ListNode(0);
    preHead.next = head;
    ListNode before = preHead;
    for (int i = 1; i < m; i ++)
        before = before.next;
    ListNode rTail = before.next;
    ListNode cur = before.next.next;
    for (int i = 0; i < n - m; i ++) {
        ListNode temp = cur.next;
        cur.next = before.next;
        before.next = cur;
        cur = temp;
    }
    rTail.next = cur;
    return preHead.next;
    }
}
