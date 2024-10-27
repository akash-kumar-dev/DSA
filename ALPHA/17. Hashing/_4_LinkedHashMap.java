import java.util.*;

// Keys are sorted in the order in which they were inserted.
// implementation is done by doubly linked list.
// O(1)

public class _4_LinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("US", 50);

        System.out.println(lhm);

    }
}
