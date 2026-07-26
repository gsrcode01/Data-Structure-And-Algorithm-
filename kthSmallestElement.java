public class kthSmallestElement {

    int count;
    int ans;

    public int kthSmallest(TreeNode root, int k) {

        count = k;

        inorder(root);

        return ans;
    }

    private void inorder(TreeNode curr) {

        if (curr == null) {
            return;
        }

        // Visit left subtree
        inorder(curr.left);

        // Visit current node
        count--;

        if (count == 0) {
            ans = curr.val;
            return;
        }

        // Visit right subtree
        inorder(curr.right);
    }
}
