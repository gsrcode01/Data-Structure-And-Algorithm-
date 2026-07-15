public class balancedBinaryTree {
    boolean ans = true;

    public boolean isBalanced(TreeNode root) {

        calculateHeight(root);

        return ans;
    }

    private int calculateHeight(TreeNode curr) {

        if (curr == null) {
            return 0;
        }

        int leftHeight =
                calculateHeight(curr.left);

        int rightHeight =
                calculateHeight(curr.right);

        if (Math.abs(leftHeight -
                rightHeight) > 1) {

            ans = false;
        }

        return 1 +
                Math.max(leftHeight,
                        rightHeight);
    }
}
