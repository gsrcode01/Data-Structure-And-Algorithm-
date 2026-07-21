public class countGoodNodes {

        int ans = 0;

        public int goodNodes(TreeNode root) {

            traversal(root, Integer.MIN_VALUE);

            return ans;
        }

        private void traversal(TreeNode curr, int maxSeenSoFar) {

            if (curr == null) {
                return;
            }

            // Current node is good
            if (curr.val >= maxSeenSoFar) {
                ans++;
            }

            // Update maximum value seen on this path
            int currMax = Math.max(maxSeenSoFar, curr.val);

            traversal(curr.left, currMax);
            traversal(curr.right, currMax);
        }
}
