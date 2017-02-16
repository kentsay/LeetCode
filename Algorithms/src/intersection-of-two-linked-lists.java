/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        Result resultA = findTailAndLength(headA);
        Result resultB = findTailAndLength(headB);

        //if tail of A is not equal to tail of B, then there is no intersection in this two list, return null
        if (resultA.tail != resultB.tail) return null;

        ListNode longer = (resultA.length > resultB.length)? headA : headB;
        ListNode shorter = (resultA.length > resultB.length)? headB: headA;

        //chop of the longer one
        longer = chopOffDifference(longer, Math.abs(resultA.length - resultB.length));

        while(shorter != longer) {
            longer = longer.next;
            shorter = shorter.next;
        }
        return longer;
    }

    Result findTailAndLength(ListNode node) {
        if (node == null) return null;

        int length = 0;
        while(node != null) {
            length++;
            node = node.next;
        }
        return new Result(length, node);
    }

    ListNode chopOffDifference(ListNode node, int size) {
        if (node == null) return null;
        if (size == 0) return node;

        for(int i=0; i<size; i++) {
            node = node.next;
        }
        return node;
    }
}

class Result {
    int length;
    ListNode tail;

    public Result(int length, ListNode node) {
        this.length = length;
        this.tail = node;
    }
}
