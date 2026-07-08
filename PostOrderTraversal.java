public class PostOrderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> ans = new ArrayList<>();

        postorder(root, ans);

        return ans;
    }

    // Left -> Right -> Root
    private void postorder(TreeNode root, List<Integer> ans) {

        // Base case
        if (root == null) {
            return;
        }

        // Traverse left subtree
        postorder(root.left, ans);

        // Traverse right subtree
        postorder(root.right, ans);

        // Visit current node
        ans.add(root.val);
    }
}
