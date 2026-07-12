public class levelOrderTraversal {
    /* Iterative Approch (little complex but not too much )
        public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);

        while (!q.isEmpty()) {

            List<Integer> levelArr = new ArrayList<>();

            int levelSize = q.size();

            // Process all nodes of current level
            for (int i = 0; i < levelSize; i++) {

                TreeNode curr = q.poll();

                levelArr.add(curr.val);

                if (curr.left != null) {
                    q.offer(curr.left);
                }

                if (curr.right != null) {
                    q.offer(curr.right);
                }
            }

            ans.add(levelArr);
        }

        return ans;
    }
    */

    // Recursive Approach-
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        traversal(root, 0, ans);

        return ans;
    }

    private void traversal(TreeNode curr,
                           int level,
                           List<List<Integer>> ans) {

        // First node of this level
        if (ans.size() == level) {
            ans.add(new ArrayList<>());
        }

        // Put current node into its level
        ans.get(level).add(curr.val);

        if (curr.left != null) {
            traversal(curr.left, level + 1, ans);
        }

        if (curr.right != null) {
            traversal(curr.right, level + 1, ans);
        }
    }
}
