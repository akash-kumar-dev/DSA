import java.util.*;
import java.util.LinkedList;

public class _4_queue_JCF {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(); // ArrayDeque

        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek()); // 1 2 3
            q.remove();
        }
    }
}
