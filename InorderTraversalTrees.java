public class InorderTraversalTrees {
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> ans = new ArrayList<>();
        inorder(root, ans);
        return ans;
    }
    // Left -> Root -> Right
    private void inorder(TreeNode root, List<Integer> ans) {
        // Base case
        if (root == null) {
            return;
        }
        // Traverse left subtree
        inorder(root.left, ans);
        // Visit current node
        ans.add(root.val);
        // Traverse right subtree
        inorder(root.right, ans);
    }
}
