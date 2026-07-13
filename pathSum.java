public class pathSum {
    /*Aprroch-1 Top-Down Approch
    class Solution {

    boolean ans = false;

    public boolean hasPathSum(TreeNode root, int targetSum) {

        if (root == null) {
            return false;
        }

        traverse(root, 0, targetSum);

        return ans;
    }

    private void traverse(TreeNode curr,
                          int currSum,
                          int targetSum) {

        int newSum = currSum + curr.val;

        // Leaf node
        if (curr.left == null &&
            curr.right == null) {

            if (newSum == targetSum) {
                ans = true;
            }
        }

        if (curr.left != null) {
            traverse(curr.left, newSum, targetSum);
        }

        if (curr.right != null) {
            traverse(curr.right, newSum, targetSum);
        }
    }
}
     */

    //Approch-2 bottom up Approch
    public boolean hasPathSum(TreeNode root, int targetSum) {

        // Empty tree
        if (root == null) {
            return false;
        }

        // Leaf node
        if (root.left == null &&
                root.right == null) {

            return root.val == targetSum;
        }

        boolean leftSubTreeHasPathSum =
                hasPathSum(root.left,
                        targetSum - root.val);

        boolean rightSubTreeHasPathSum =
                hasPathSum(root.right,
                        targetSum - root.val);

        return leftSubTreeHasPathSum
                || rightSubTreeHasPathSum;
    }
}
