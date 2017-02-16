/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int treeHeight(TreeNode root) {
        if (root == null) return -1;

        int left_height = treeHeight(root.left);
        if (left_height == Integer.MIN_VALUE) return Integer.MIN_VALUE;

        int right_height = treeHeight(root.right);
        if (right_height == Integer.MIN_VALUE) return Integer.MIN_VALUE;

        int diff = left_height - right_height;
        if (Math.abs(diff) > 1)
            return Integer.MIN_VALUE;
        else
            return Math.max(left_height, right_height) + 1;
    }

    public boolean isBalanced(TreeNode root) {
        return treeHeight(root) != Integer.MIN_VALUE;
    }
}
