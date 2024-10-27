import java.util.*;

public class _9_Iteration_on_HashSet {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");

        // Iterator Method
        // Iterator is interfaces in java.util package
        Iterator it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // ForEach Method
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
