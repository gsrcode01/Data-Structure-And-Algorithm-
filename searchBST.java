public class searchBST {
    public TreeNode searchBST(TreeNode root, int val) {

        if (root == null) {
            return null;
        }

        // Found the node
        if (root.val == val) {
            return root;
        }

        // Search in right subtree
        if (root.val < val) {
            return searchBST(root.right, val);
        }

        // Search in left subtree
        return searchBST(root.left, val);
    }
    //Aproach -2
//
//    public TreeNode searchBST(TreeNode root, int val) {
//
//        // Tree is empty or value found
//        if (root == null || root.val == val) {
//            return root;
//        }
//
//        // If value is larger, search right subtree
//        // Otherwise, search left subtree
//        return root.val < val
//                ? searchBST(root.right, val)
//                : searchBST(root.left, val);
//    }
}
