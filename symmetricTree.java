public class symmetricTree {public boolean isSymmetric(TreeNode root) {

    if (root == null) {
        return true;
    }

    return isMirror(root.left,
            root.right);
}

    private boolean isMirror(TreeNode left,
                             TreeNode right) {

        // Both null
        if (left == null &&
                right == null) {
            return true;
        }

        // One null
        if (left == null ||
                right == null) {
            return false;
        }

        return left.val == right.val
                &&
                isMirror(left.left,
                        right.right)
                &&
                isMirror(left.right,
                        right.left);
    }
}
