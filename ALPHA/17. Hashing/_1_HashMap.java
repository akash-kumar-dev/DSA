import java.util.*;

public class _1_HashMap {
    public static void main(String[] args) {
        // create
        HashMap<String, Integer> hm = new HashMap<>();
        // Hasmap are unordered

        // insert - O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);

        // get - O(1)
        int population = hm.get("India");
        System.out.println(population);
        System.out.println(hm.get("Indonesia")); // retruns null for non existing key

        // containsKey - O(1) - returns true or false for existing key
        System.out.println(hm.containsKey("India")); // true
        System.out.println(hm.containsKey("Indonesia")); // false

        // remove - O(1)
        System.out.println(hm.remove("China")); // returns the value of the key (null if not present)
        System.out.println(hm);

        // size
        System.out.println(hm.size());

        // isEmpty
        hm.clear(); // clears the hashmap
        System.out.println(hm.isEmpty());
    }
}
