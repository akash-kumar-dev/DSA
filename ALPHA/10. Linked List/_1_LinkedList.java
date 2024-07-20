public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) { // O(1) Constant
        // step 1 -> create new node
        Node newNode = new Node(data);
        size++;

        // if no any node in LL
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2 -> newNode Next = head (head of previous node)
        newNode.next = head; // Link

        // step 3 -> head = newNode (Changing the head to newNode)
        head = newNode;
    }

    public void addLast(int data) { // O(1) Constant T.C.
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        // finding previous node Idx and making pointing it to temp Node
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        // i = idx-1; temp -> prev Node
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        // prev Node idx = size-2
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data; // tail data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // ------------------------------
    // Iterative Search -> O(n)
    public int iterativeSearch(int key) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        // key not found
        return -1;
    }

    // Recursive Search -> O(n)
    public int recursiveSearchHelper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = recursiveSearchHelper(head.next, key);
        if (idx == -1) {
            return -1;
        }

        return idx + 1;
    }

    public int recursiveSearch(int key) {
        return recursiveSearchHelper(head, key);
    }

    // ------------------------------
    // Find and Remove Nth node from end ***
    public void deleteNthFromEnd(int n) {
        // calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (n == sz) {
            head = head.next; // remove first Node
            return;
        }

        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;

    }

    // ------------------------------
    // Reverse a LL
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    // ------------------------------

    // Slow-Fast Approach
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }

        return slow; // slow will mid Node
    }

    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        // Step1 - Find Mid
        Node midNode = findMid(head);

        // step2 - reversse 2nd Half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; // Right half head
        Node left = head;

        // step3 - check left half and right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;

    }

    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.print(); // 2->null
        ll.addFirst(1);
        ll.print(); // // 1->2->null
        ll.addLast(3);
        ll.print(); // // 1->2->3->null
        ll.addLast(4);
        ll.print(); // 1->2->3->4->null
        ll.add(2, 9);
        ll.print(); // 1->2->9->3->4->null

        // System.out.println("Size of LL: " + size);

        ll.removeFirst();
        ll.print(); // 2->9->3->4->null
        ll.removeLast();
        ll.print();

        // System.out.println(ll.iterativeSearch(3));
        // System.out.println(ll.iterativeSearch(7));

        System.out.println(ll.recursiveSearch(3));
        System.out.println(ll.recursiveSearch(7));

        ll.addFirst(6);
        ll.addFirst(7);
        ll.addFirst(8);
        ll.addFirst(9);
        ll.print();
        ll.deleteNthFromEnd(3);
        ll.print(); // 9->8->7->6->9->3->null

        System.out.println("Rverse LL");
        ll.reverse();
        ll.print(); // 3->9->6->7->8->9->null

        ll.addFirst(6);
        ll.addFirst(7);
        ll.addFirst(8);
        ll.addFirst(9);
        ll.deleteNthFromEnd(5);
        ll.print();
        System.out.println(ll.checkPalindrome());
    }
}
