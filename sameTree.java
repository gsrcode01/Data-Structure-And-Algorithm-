public class sameTree {
    public boolean isSameTree(TreeNode p,
                              TreeNode q) {

        // Both are null
        if (p == null && q == null) {
            return true;
        }

        // One is null
        if (p == null || q == null) {
            return false;
        }

        return p.val == q.val
                &&
                isSameTree(p.left, q.left)
                &&
                isSameTree(p.right, q.right);
    }
}
