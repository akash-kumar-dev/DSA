// find if any pair in a sorted Arraylist has a target sum
// list = [1.2.3.4.5], target = 5



import java.util.ArrayList;

public class _4_pairSum1 {

    // BruteForce Method
    // public static boolean pairSum1(ArrayList<Integer> list, int target) {
    // for (int i = 0; i < list.size(); i++) {
    // for (int j = i; j < list.size(); j++) {
    // if (list.get(i) + list.get(j) == target) {
    // return true;
    // }
    // }
    // }

    // return false;
    // }

    // Two pointer approach
    public static boolean pairSum1(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() -1;

        while(lp != rp) {
            if(list.get(lp) + list.get(rp) == target) {
                return true;
            }

            if(list.get(lp) + list.get(rp) < target) {
                lp++;
            } else {
                rp--;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // 1,2,3,4,5,6
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 5;

        System.out.println(pairSum1(list, target));
    }
}
