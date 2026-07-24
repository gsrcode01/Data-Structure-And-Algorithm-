public class validateBinarySearchTree {

        public boolean isValidBST(TreeNode root) {

            return isBST(root, null, null);
        }

        private boolean isBST(TreeNode curr,
                              Integer low,
                              Integer high) {

            // Empty tree is always a BST
            if (curr == null) {
                return true;
            }

            // Current node must lie within the range
            if ((low != null && curr.val <= low) ||
                    (high != null && curr.val >= high)) {
                return false;
            }

            // Left subtree: values must be < curr.val
            boolean isLeftBST =
                    isBST(curr.left,
                            low,
                            curr.val);

            // Right subtree: values must be > curr.val
            boolean isRightBST =
                    isBST(curr.right,
                            curr.val,
                            high);

            return isLeftBST && isRightBST;
        }

}
