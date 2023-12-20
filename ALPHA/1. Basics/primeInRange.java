import java.util.Scanner;

public class primeInRange {
    public static void primeInRange(int num) {
        for(int i=2;i<num;i++){
            boolean isPrime = true;
            for(int j=2;j<i;j++){
                if(i%j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime == true){
                System.out.print(i + " ");
            }
        }
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a Number : ");
        int n = sc.nextInt();

        primeInRange(n);
    }
}