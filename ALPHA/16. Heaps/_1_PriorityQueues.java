import java.util.Comparator;
import java.util.PriorityQueue;

public class _1_PriorityQueues {
    // studnet class implements a interface called Comparable, we can use it to compare the objects of Student class
    static class  Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }
        
        // overriding (if parent class have a function and child class also want to implements that function)
        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();   // Asending Order (Default)
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());     // Desending Order

        pq.add(7);  // O(logn)
        pq.add(4);
        pq.add(1);
        pq.add(3);

        while (!pq.isEmpty()) {
            System.out.print(pq.peek() + " ");     // O(1)
            pq.remove();    // O(logn)
        }   // 1 3 4 7


        // priority queue for Objects
        PriorityQueue<Student> s = new PriorityQueue<>();
        s.add(new Student("A", 4));
        s.add(new Student("B", 5));
        s.add(new Student("C", 2));
        s.add(new Student("D", 12));

        while (!s.isEmpty()) {
            System.out.println(s.peek().name + " -> " + s.peek().rank);    // O(1)
            s.remove();
        }
    }
}
