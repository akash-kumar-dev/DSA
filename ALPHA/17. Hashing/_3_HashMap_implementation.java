import java.util.*;
import java.util.LinkedList;

public class _3_HashMap_implementation {

    // Custom HashMap implementation
    static class HashMap<K, V> { // K: Key type, V: Value type
        // Node class to store key-value pairs
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // Number of key-value pairs
        private int N; // Number of buckets
        private LinkedList<Node> buckets[]; // Array of LinkedList to store nodes

        // Constructor to initialize HashMap
        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        // Hash function to determine bucket index
        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        // Search for a key in a specific bucket
        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            int di = 0;

            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key == key) {
                    return di;
                }
                di++;
            }

            return -1;
        }

        // Rehash function to resize the HashMap
        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node> oldBuck[] = buckets;
            buckets = new LinkedList[N * 2];
            N = N * 2;

            // Add nodes from old buckets to new buckets
            for (int i = 0; i < oldBuck.length; i++) {
                LinkedList<Node> ll = oldBuck[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }

        // Put a key-value pair in the HashMap
        public void put(K key, V value) { // O(lambda) -> O(1) average case
            int bi = hashFunction(key); // bucket index
            int di = searchInLL(key, bi); // data index

            if (di != -1) { // key exists, update value
                Node node = buckets[bi].get(di);
                node.value = value;
            } else { // key doesn't exist, add new node
                buckets[bi].add(new Node(key, value));
                n++;
            }

            // Check load factor and rehash if necessary
            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehash();
            }
        }

        // Check if the HashMap contains a key
        public boolean containsKey(K key) { // O(1) average case
            int bi = hashFunction(key); // bucket index
            int di = searchInLL(key, bi); // data index

            if (di != -1) { // valid value
                return true;
            } else {
                return false;
            }
        }

        // Remove a key-value pair from the HashMap
        public V remove(K key) { // O(1) average case
            int bi = hashFunction(key); // bucket index
            int di = searchInLL(key, bi); // data index

            if (di != -1) {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            } else {
                return null;
            }
        }

        // Get the value associated with a key
        public V get(K key) { // O(1) average case
            int bi = hashFunction(key); // bucket index
            int di = searchInLL(key, bi); // data index

            if (di != -1) {
                Node node = buckets[bi].get(di);
                return node.value;
            } else {
                return null;
            }
        }

        // Get all keys in the HashMap
        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        // Check if the HashMap is empty
        public boolean isEmpty() {
            return n == 0;
        }

    }

    public static void main(String[] args) {
        // Create a new HashMap
        HashMap<String, Integer> hm = new HashMap<>();

        // Add key-value pairs
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Indonesia", 6);
        hm.put("Nepal", 5);

        // Get and print all keys
        ArrayList<String> keys = hm.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

        // Get, remove, and get again for "India"
        System.out.println(hm.get("India"));
        System.out.println(hm.remove("India"));
        System.out.println(hm.get("India"));
    }
}
