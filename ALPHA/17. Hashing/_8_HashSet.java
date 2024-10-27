import java.util.HashSet;

public class _8_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(4);
        set.add(1);
        set.add(2);
        System.out.println(set); // 1 2 4 (unique elements)

        set.remove(2);
        set.contains(2); // false

        System.out.println(set);
        set.clear();
        System.out.println(set.size());
        System.out.println(set.isEmpty());
    }
}
