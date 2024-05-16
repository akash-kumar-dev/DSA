public class test {
    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }

        if (n < 0) {
            x = 1.0 / x;
            n = Math.abs(n);
        }

        double temp = myPow(x, n / 2);

        if (n % 2 == 1) {
            return temp * temp * x;
        }

        return temp * temp;
    }

    public static void main(String args[]) {
        double x = 2.00000;
        int n = -2147483648;

        System.out.println(myPow(x, n));
    }
}


/*

// 50. Pow(x, n)


// Medium


// Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

 

// Example 1:

// Input: x = 2.00000, n = 10
// Output: 1024.00000
// Example 2:

// Input: x = 2.10000, n = 3
// Output: 9.26100
// Example 3:

// Input: x = 2.00000, n = -2
// Output: 0.25000
// Explanation: 2-2 = 1/22 = 1/4 = 0.25

*/