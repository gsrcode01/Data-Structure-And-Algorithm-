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
//Approach-2 "Iterative Approach or Non-Recursive Approach"
/*
class Solution {

    public boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return true;
        }

        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root.left);
        q.offer(root.right);

        while (!q.isEmpty()) {

            TreeNode p1 = q.poll();
            TreeNode p2 = q.poll();

            // both are null
            if (p1 == null && p2 == null) {
                continue;
            }

            // only one is null
            if (p1 == null || p2 == null) {
                return false;
            }

            // values are different
            if (p1.val != p2.val) {
                return false;
            }

            // push mirror children
            q.offer(p1.left);
            q.offer(p2.right);

            q.offer(p1.right);
            q.offer(p2.left);
        }

        return true;
    }
}
*/