/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> ans = new ArrayList<>();

        preorder(root, ans);

        return ans;
    }

    // Root -> Left -> Right
    private void preorder(TreeNode root, List<Integer> ans) {

        // If node is null, stop recursion
        if (root == null) {
            return;
        }

        // Visit root
        ans.add(root.val);

        // Traverse left subtree
        preorder(root.left, ans);

        // Traverse right subtree
        preorder(root.right, ans);
    }
}
