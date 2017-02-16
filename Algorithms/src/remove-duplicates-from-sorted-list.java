/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;

        ListNode fakeHead = new ListNode(-1);
        fakeHead.next = head;
        ListNode node = head;
        while (node.next != null){
            if (node.next.val == node.val){
                node.next = node.next.next;
            }
            else{
                node = node.next;
            }
        }//while node != null
        return fakeHead.next;


    }
}
