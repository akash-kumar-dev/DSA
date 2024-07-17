import java.util.ArrayList;
import java.util.Collections;

// import java.util.*;
public class _1_Basics {
    public static void main(String[] args) {
        // ArrayList is part of Java Collection FrameWork
        // String | Boolean | Float
        // ClassName objectName = new ClassName();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        // Add Element Operation - O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(1, 9); // O(n) - add Element 9 at index 1

        System.out.println(list);

        // Get Element Operation - O(1)
        int element = list.get(2);
        // System.out.println(element);

        // Delete Element -> T.C. - Linear O(n)
        list.remove(2);

        // set Element at Index i -> T.C. - Linear O(n)
        // list.set(index, element)
        list.set(2, 10);
        System.out.println(list);

        // Containes Element - O(n)
        System.out.println(list.contains(3));   // returns Boolean Value

        // size();
        System.out.println(list.size());

        // Print ArrayList
        for(int i = 0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();

        // Sorting in ArrayList
        Collections.sort(list);
        Collections.sort(list, Collections.reverseOrder());
        // Collections.reverseOrder() -> Comparator - function lofic
        System.out.println(list);

    }

}