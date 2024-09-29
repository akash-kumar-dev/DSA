// Merge Two BST in a Balanced BST

import java.util.*;

public class _7_Merge_Two_BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void getInorder(Node root, ArrayList<Integer> arr) {
        if(root == null) {
            return;
        }

        getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.right, arr);
    }

    public static Node createBST(ArrayList<Integer> arr, int st, int end) {
        if(st > end) {
            return null;
        }

        int mid = (st+end)/2;
        Node root = new Node(arr.get(mid));
        root.left = createBST(arr, st, mid-1);
        root.right = createBST(arr, mid+1, end);
        return root;
    }

    public static Node mergeBSTs(Node root1, Node root2) {
        // step - 1 (inorder sequence of root1)
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(root1, arr1);

        // step - 2 (inorder sequence of root2)
        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root2, arr2);

        // Merge both inorder sequence
        int i = 0, j = 0;
        ArrayList<Integer> finalArr = new ArrayList<>();
        while (i < arr1.size() && j < arr2.size()) {
            if(arr1.get(i) <= arr2.get(j)) {
                finalArr.add(arr1.get(i));
                i++;
            } else {
                finalArr.add(arr2.get(j));
                j++;
            }
        }

        while(i < arr1.size()) {
            finalArr.add(arr1.get(i));
            i++;
        }

        while(j < arr2.size()) {
            finalArr.add(arr2.get(j));
            j++;
        }

        // sorted final ArrayList -> create Balanced BST
        return createBST(finalArr, 0, finalArr.size() - 1);
    }

    public static void preOrder(Node root) {
        if(root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

    public static void main(String[] args) {
        /*
         *          2
         *         / \
         *        1   4
         *         BST 1
         */
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        /*
         *          9
         *         /  \
         *        3    12
         *         BST 2
         */
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        /*
         *          3
         *        /   \
         *       1      9
         *        \    / \
         *          2  4  12
         *         final BST
         */

        Node root = mergeBSTs(root1, root2);
        preOrder(root); // 3 1 2 9 4 12
    }
}
