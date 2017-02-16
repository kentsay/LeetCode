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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        LinkedList queue = new LinkedList();
        if (root == null) return result;

        queue.add(root);

        List<Integer> rootNodeList = new ArrayList<Integer>();
        rootNodeList.add(root.val);
        result.add(rootNodeList);

        int queueCnt = 0;
        while(queue.size() != 0) {
            queueCnt = queue.size();
            ArrayList<Integer> nodeList = new ArrayList<Integer>();
            while (queueCnt > 0) {
                TreeNode node = (TreeNode)queue.pop();
                if (node.left != null) {
                    nodeList.add(node.left.val);
                    queue.add(node.left);
                }
                if (node.right != null) {
                    nodeList.add(node.right.val);
                    queue.add(node.right);
                }
                queueCnt --;
            }
            if (!nodeList.isEmpty())
                result.add(nodeList);
        }
        Collections.reverse(result);
        return result;
    }

}
