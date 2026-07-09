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
    /* Iterative Approach

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> ans = new ArrayList<>();

        // Empty tree
        if (root == null) {
            return ans;
        }

        Stack<TreeNode> stack = new Stack<>();

        // Push root first
        stack.push(root);

        while (!stack.isEmpty()) {

            // Visit current node
            TreeNode curr = stack.pop();
            ans.add(curr.val);

            // Push right child first
            if (curr.right != null) {
                stack.push(curr.right);
            }

            // Push left child second
            if (curr.left != null) {
                stack.push(curr.left);
            }
        }

        return ans;
    }
     */
}
