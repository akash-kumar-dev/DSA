public class RecursionBasic {

    // Print Numbers from n to 1 (Decreasing Order)
    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    // Print Numbers from 1 to n (increasing Order)
    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }

    // factorial of a Number
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        // int fnm1 = fact(n-1);
        int fn = n * fact(n - 1);
        return fn;
    }

    // sum of n natural number
    public static int calcSum(int n) {
        if (n == 1) {
            return 1;
        }
        int Snm1 = calcSum(n - 1);
        int Sn = n + Snm1;
        return Sn;
    }

    // calculate nth term in fibonacci
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static void main(String args[]) {
        // int n = 10;
        // printInc(n);
        // System.out.println(fact(5));
        // System.out.println(calcSum(5));
        System.out.println(fib(50));
    }
}