/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k==0) return head;

        int length = 1;

        ListNode node = head;

        while(node.next != null) {
            length++;
            node = node.next;
        }
        node.next = head;

        int n = 0;
        if(k>length)
            n = k % length;
        else
            n = k;



        for(int i =0; i<length-n; i++) {
            node =node.next;
        }
        head = node.next;
        node.next = null;

        return head;
    }
}
