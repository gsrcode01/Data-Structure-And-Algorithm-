public class SubtreeOfAnotherTree {
    public boolean isSubtree(TreeNode root,TreeNode subRoot) {

        String hashRoot = serialize(root);
        String hashSubRoot = serialize(subRoot);

        return hashRoot.contains(hashSubRoot);
    }

    private String serialize(TreeNode root) {

        StringBuilder sb =
                new StringBuilder();

        dfs(root, sb);

        return sb.toString();
    }

    private void dfs(TreeNode root,
                     StringBuilder sb) {

        if (root == null) {
            sb.append(",#");
            return;
        }

        sb.append(",").append(root.val);

        dfs(root.left, sb);
        dfs(root.right, sb);
    }
}
