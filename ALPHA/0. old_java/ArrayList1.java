import java.util.ArrayList;
import java.util.*;

public class ArrayList1 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<Integer>();

        //add elements
        list1.add(9);
        list1.add(3);
        list1.add(6);
            //or
        /*for(int i=0;i<3;i++){
            int temp = sc.nextInt();
            list1.add(temp);
        }*/

        System.out.println(list1);

        //get element
        int element = list1.get(2);
        System.out.println("at index 2 element : " + element);

        //add elements in between
        list1.add(2,9); //at index 2 new element 9 added
        System.out.println("New list1 : " + list1);

        //set element
        list1.set(2,8);     //at index 2 set value 8
        System.out.println("after set at ind. 2 to 8 new list : " + list1);

        //delete element
        list1.remove(2);        //at index 2 delete element
        System.out.println("after delete index 2 list : " + list1);

        //size of list
        int size = list1.size();
        System.out.println("size of list : " + size);

        //loops
        System.out.print("printing list by loop : ");
        for(int i=0;i<list1.size();i++) {
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();

        //sorting
        Collections.sort(list1);
        System.out.println("Sorted list1 : " + list1);

    }
}