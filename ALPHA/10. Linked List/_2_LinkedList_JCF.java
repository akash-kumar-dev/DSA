import java.util.LinkedList;;

public class _2_LinkedList_JCF {
    public static void main(String[] args) {
        // Create LL
        LinkedList<Integer> ll = new LinkedList<>();

        // Add in LL
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);

        System.out.println(ll); // 0->1->2

        // Remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll); // 1

    }

}