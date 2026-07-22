public class populatingNextRightPointerInEachNode {
    public Node connect(Node root) {

        if (root == null) {
            return null;
        }

        traversal(root);

        return root;
    }

    private void traversal(Node curr) {

        if (curr == null) {
            return;
        }

        // Connect left child to right child
        if (curr.left != null) {
            curr.left.next = curr.right;
        }

        // Connect right child to next subtree's left child
        if (curr.right != null && curr.next != null) {
            curr.right.next = curr.next.left;
        }

        traversal(curr.left);
        traversal(curr.right);
    }

}
