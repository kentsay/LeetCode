/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node1 = head;
        ListNode node2 = head;
        //node2 move n step before node1
        for(int i=0;i<n;i++) {
            node2 = node2.next;
        }
        if(node2 == null){
            head = head.next;
        } else {
            while(node2.next != null) {
                node1 = node1.next;
                node2 = node2.next;
            }
            //delete node1 next node
            node1.next = node1.next.next;
        }
        return head;
    }
}
