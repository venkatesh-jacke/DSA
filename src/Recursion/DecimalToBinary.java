package Recursion;

public class DecimalToBinary {
    public static void main(String[] args) {
        int decimal = 233;
        System.out.println(decimalToBinary(decimal, ""));
    }

    static String decimalToBinary(int decimal, String binary) {
        if (decimal == 0) return binary;
        binary =decimal % 2+binary;
        return decimalToBinary(decimal / 2, binary);


    }
}
