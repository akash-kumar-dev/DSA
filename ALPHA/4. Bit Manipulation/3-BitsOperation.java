public class getbit {

    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        // if(newBit == 0) {
        // return clearIthBit(n, i);
        // } else {
        // return setIthBit(n, i);
        // }

        // Method - 2
        n = clearIthBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
    }

    public static int clearIBits(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    public static int clearBitsinRange(int n, int i, int j) {
        // n = 10 = 0001010 let j>i always
        int a = ((~0) << (j + 1)); // a = 1110000
        int b = (1 << i) - i; // b = 00000011
        int bitMask = a | b; // a | b = 1110011
        return n & bitMask;
    }

    public static void main(String args[]) {
        // 10 -> 1010
        // System.out.println(getIthBit(10, 2)); // 0
        // System.out.println(getIthBit(10, 3)); // 1
        // System.out.println(setIthBit(10, 2)); // 1010 -> 1110 = 14
        // System.out.println(clearIthBit(10, 1)); // 10 = 1010 -> 1000 = 8
        // System.out.println(updateIthBit(10, 2, 1)); // 10 = 1010 -> 1110 = 14
        // System.out.println(clearIBits(15, 2)); // 15 = 1111 -> for 2 bits -> 1100 =
        // 12
        System.out.println(clearBitsinRange(10, 2, 4)); // 10 = 0001010 -> 0000010 = 2

    }

}
