public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {

        // Empty tree
        if (root == null) {
            return null;
        }

        // Swap children
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Invert left subtree
        invertTree(root.left);

        // Invert right subtree
        invertTree(root.right);

        return root;
    }
}
