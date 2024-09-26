public class _1_BST {

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

    // search in BST
    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }

        if(root.data == key) {
            return true;
        }

        if(root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    // delete a node
    public static Node delete(Node root, int val) {
        if(root.data < val) {
            root.right = delete(root.right, val);
        }
        
        else if (root.data > val) {
            root.left = delete(root.left, val);
        }
        
        else {
            // case 1 - leaf node
            if(root.left == null && root.right == null) {
                return null;
            }

            // case 2 - single child
            if(root.left == null) {
                return root.right;
            }
            else if(root.right == null) {
                return root.left;
            }

            // case3 - both children
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }

        return root;
    }

    public static Node findInorderSuccessor(Node root){
        while (root.left != null) {
            root = root.left;
        }

        return root;
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
        // int values[] = { 5, 1, 3, 4, 2, 7 };
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inorder(root);  // 1 3 4 5 6 8 10 11 14 
        System.out.println();

        // search in BST
        System.err.println(search(root, 7));

        // Delete a Node
        root = delete(root, 1);
        inorder(root);  // 3 4 5 6 8 10 11 14
    }
}
