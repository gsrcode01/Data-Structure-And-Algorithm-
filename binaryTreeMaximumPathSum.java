public class binaryTreeMaximumPathSum {

    int maxSumPath = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {

        traversal(root);

        return maxSumPath;
    }

    private int traversal(TreeNode curr) {

        if (curr == null) {
            return 0;
        }

        // Ignore negative paths
        int maxLeft = Math.max(0, traversal(curr.left));
        int maxRight = Math.max(0, traversal(curr.right));

        // Maximum path passing through current node
        int currMax = curr.val + maxLeft + maxRight;

        maxSumPath = Math.max(maxSumPath, currMax);

        // Return only one path to parent
        return curr.val + Math.max(maxLeft, maxRight);
    }
}
