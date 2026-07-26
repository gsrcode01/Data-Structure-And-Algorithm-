public class insertBST {
    public TreeNode insertIntoBST(TreeNode root, int val) {

        // Reached the insertion point
        if (root == null) {
            return new TreeNode(val);
        }

        // Insert in right subtree
        if (val > root.val) {
            root.right = insertIntoBST(root.right, val);
        }
        // Insert in left subtree
        else {
            root.left = insertIntoBST(root.left, val);
        }

        return root;
    }
}
