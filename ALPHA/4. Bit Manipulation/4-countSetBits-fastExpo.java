public class problems {

    public static boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    // Countn set Bits in a Number. (no. of 1's in binary)
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static int fastExpo(int a, int n) {
        int ans = 1;

        while (n > 0) { // Check LSB
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String args[]) {
        System.out.println(isPowerOfTwo(16));
        System.out.println(countSetBits(15)); // 10 -> 1010 = 2, 15 -> 01111 = 4
        System.out.println(fastExpo(3, 5));
    }

}