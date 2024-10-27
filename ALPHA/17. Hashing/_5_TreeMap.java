import java.util.*;
// Keys are sorted in the order in which they were inserted.
// sorting is done on basis of keys
// insert, remove, get - O(logn)
// implementation is done by Red Black Tree (selff balancing BST)

public class _5_TreeMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("China", 150);
        tm.put("US", 50);
        tm.put("Indonesia", 6);

        System.out.println(tm);
        // {China=150, India=100, Indonesia=6, US=50}
    }
}
