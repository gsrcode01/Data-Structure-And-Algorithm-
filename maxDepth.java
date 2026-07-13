public class maxDepth {
    /* Approch 1 top-down Approch
    class Solution {

    int maxDepth = 0;

    public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        traversal(root, 1);

        return maxDepth;
    }

    private void traversal(TreeNode curr, int depth) {

        // Update answer
        maxDepth = Math.max(maxDepth, depth);

        if (curr.left != null) {
            traversal(curr.left, depth + 1);
        }

        if (curr.right != null) {
            traversal(curr.right, depth + 1);
        }
    }
}
    */

    //Aproch-2 bottom-Up Approch
    public int maxDepth(TreeNode root) {

        // Empty tree has depth 0
        if (root == null) {
            return 0;
        }

        int leftMax = maxDepth(root.left);
        int rightMax = maxDepth(root.right);

        // Current depth =
        // 1 (current node) + maximum of left and right depth
        return 1 + Math.max(leftMax, rightMax);
    }
}
