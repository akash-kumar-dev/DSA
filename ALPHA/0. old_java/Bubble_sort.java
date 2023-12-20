import java.util.*;

public class Bubble_sort {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        //Bubble Sort
        for(int i=0;i<arr.length-1;i++) {
            for(int j=0;j<arr.length-i-1;j++) {
                if(arr[j]>arr[j+1]) {
                    //Swap
                    int temp  = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}