public class BinartTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> ans =
                new ArrayList<>();

        if (root == null) {
            return ans;
        }

        Queue<TreeNode> q =
                new LinkedList<>();

        q.offer(root);

        while (!q.isEmpty()) {

            int levelSize = q.size();

            for (int i = 0;
                 i < levelSize;
                 i++) {

                TreeNode curr =
                        q.poll();

                // First node of level
                if (i == 0) {
                    ans.add(curr.val);
                }

                // Push right first
                if (curr.right != null) {
                    q.offer(curr.right);
                }

                if (curr.left != null) {
                    q.offer(curr.left);
                }
            }
        }

        return ans;
    }
}
