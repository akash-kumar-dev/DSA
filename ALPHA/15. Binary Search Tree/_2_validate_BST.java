public class _2_validate_BST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Build a BST
    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            // left sub Tree
            root.left = insert(root.left, val);
        } else {
            // right sub Tree
            root.right = insert(root.right, val);
        }

        return root;
    }


    public static boolean isValidBST(Node root, Node min, Node max) {
        if(root == null) {
            return true;
        }

        if(min != null && root.data <= min.data) {
            return false;
        }

        else if (max != null && root.data >= max.data) {
            return false;
        }

        return isValidBST(root.left, min, max) && isValidBST(root.right, min, max);
    }


    // inorder traversal print
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inorder(root);  // 1 3 4 5 6 8 10 11 14 
        System.out.println();

        if(isValidBST(root, null, null)) {
            System.out.println("valid");
        } else {
            System.out.println("NOT valid");
        }
    }
}
