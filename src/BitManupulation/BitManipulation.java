package BitManupulation;

public class BitManipulation {

    public static void decimalToBinary(int n) {
        for (int i = 31; i >= 0; i--) {
            System.out.print((n >> i) & 1);
        }
        System.out.println();
    }

    public static int binaryToDecimal(String s) {
        int decimal = 0, powerOf2 = 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            decimal = decimal + (s.charAt(i) == '1' ? powerOf2 : 0);
            powerOf2 *= 2;
        }
        return decimal;
    }


    //Always use '|' to unset the bits
    public static int setIthBit(int n, int i) {
        return n | (1 << i);
    }


    //Always use the '&' to unset the bit with the complement of the mask
    public static int unsetIthBit(int n, int i) {
        return n & ~(1 << i);
    }
}
