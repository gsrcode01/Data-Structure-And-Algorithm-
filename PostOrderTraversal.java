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
    /* Iterative Approach

     public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();

        s1.push(root);

        while (!s1.isEmpty()) {

            TreeNode curr = s1.pop();

            s2.push(curr);

            if (curr.left != null) {
                s1.push(curr.left);
            }

            if (curr.right != null) {
                s1.push(curr.right);
            }
        }

        while (!s2.isEmpty()) {
            ans.add(s2.pop().val);
        }

        return ans;
    }
     */
}
