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
    /* Iterative Approch

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()) {

            // Keep going left and store path
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            // Visit node
            curr = stack.pop();
            ans.add(curr.val);

            // Move to right subtree
            curr = curr.right;
        }

        return ans;
    }
    */
}
