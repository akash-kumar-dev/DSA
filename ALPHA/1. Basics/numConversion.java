import java.util.Scanner;

public class numConversion {
    public static int binToDec (int bin) {
        int pow = 0;
        int dec = 0;

        while (bin > 0) {
            int lastDigit = bin % 10;
            dec = dec + (lastDigit * (int)Math.pow(2,pow));

            pow++;
            bin = bin/10;
        }
        return dec;
    }
    public static int decToBin(int dec) {
        int bin = 0;
        int pow = 0;

        while(dec>0){
            int lastDigitBin = dec % 2;
            bin = bin + (lastDigitBin * (int)Math.pow(10,pow));

            pow++;
            dec = dec/2;
        }
        return bin;
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("-------------------");
            System.out.println("1. Binary to Decimal");
            System.out.println("2. Decimal to Binary");
            System.out.println("0. Exit");
            System.out.print("Input Choice : ");
            choice = sc.nextInt();
            System.out.println("---------------------");

            switch (choice) {
                case 1:
                    System.out.print("Enter a Binary Number : ");
                    int bin = sc.nextInt();
                    System.out.println("Binary : " + binToDec(bin));
                    break;

                case 2:
                    System.out.print("Enter a Decimal Number : ");
                    int dec = sc.nextInt();
                    System.out.println("Decimal : " + decToBin(dec));
                    break;

                case 0:
                    System.out.println("Thank you for use this code...");
                    break;

                default:
                    System.out.println("Please Input a valid choice...");
                    break;
            }
        } while (choice!=0);
    }
}