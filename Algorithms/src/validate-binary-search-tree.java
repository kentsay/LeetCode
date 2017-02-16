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
    public boolean isValidBST(TreeNode root) {
        return checkBST(root, null, null);
    }
    public boolean checkBST(TreeNode root, Integer min, Integer max) {
        if (root == null) return true;

        if ((min != null && root.val <= min) || (max != null && root.val >= max)) {
            return false;
        }

        if ((!checkBST(root.left, min, root.val)) || (!checkBST(root.right, root.val, max))) {
            return false;
        }
        return true;
    }
}
