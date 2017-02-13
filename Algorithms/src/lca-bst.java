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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int small = Math.min(p.val, q.val);
        int large = Math.max(p.val, q.val);

        if (root.val > small && root.val < large) return root;
        else if (root.val > small && root.val > large) return lowestCommonAncestor(root.left, p, q);
        else if (root.val < small && root.val < large) return lowestCommonAncestor(root.right, p, q);

        return root;
    }
}
