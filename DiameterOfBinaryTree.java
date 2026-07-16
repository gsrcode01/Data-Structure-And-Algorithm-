public class DiameterOfBinaryTree {
    int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {

        findDepth(root);

        return maxDiameter;
    }

    private int findDepth(TreeNode curr) {

        if (curr == null) {
            return 0;
        }

        int leftDepth = findDepth(curr.left);
        int rightDepth = findDepth(curr.right);

        // Diameter passing through current node
        int currDiameter =
                leftDepth + rightDepth;

        maxDiameter =
                Math.max(maxDiameter,
                        currDiameter);

        // Return height
        return 1 +
                Math.max(leftDepth,
                        rightDepth);
    }
}
