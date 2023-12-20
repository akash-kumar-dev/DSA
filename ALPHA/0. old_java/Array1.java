import java.util.*;

public class Array1 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n,key;
        System.out.print("Input Size of Array : ");
        n = sc.nextInt();
        int array[] = new int[n];
        System.out.print("Input Array Data : ");
        for(int i=0;i<n;i++)
            array[i] = sc.nextInt();
        System.out.print("Input key to serach : ");
        key = sc.nextInt();
        int i=0;
        for(i=0;i<n;i++) {
            if(array[i]==key){
                System.out.println("Key found at index " +i+" .");
                break;
            }
        }
        if(i==n)
            System.out.println("Key not found...!");
    }
}