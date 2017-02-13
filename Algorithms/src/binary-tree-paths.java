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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> list = new ArrayList<String>();
        if (root == null) return list;
        treepath(root, list, "");
        return list;

    }

    public void treepath(TreeNode root, ArrayList<String> list, String path) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            list.add(path+Integer.toString(root.val));
        }

        path = path+Integer.toString(root.val)+"->";
        treepath(root.left, list, path);
        treepath(root.right, list, path);
    }
}
