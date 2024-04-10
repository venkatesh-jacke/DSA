package Math;


public class DecimalToBinary {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(decimalToBinary(n));
        System.out.println(binaryToDecimal(decimalToBinary(n)));
    }

    static String decimalToBinary(int n) {
        String binary = "";
        while (n > 0) {
            int rem = n % 2;
            binary = rem + binary;
            n /= 2;
        }
        return binary;
    }

    static int binaryToDecimal(String binary) {
        int decimal = 0;
        int powerOf2 = 1;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if(binary.charAt(i)=='1'){
                decimal=decimal+powerOf2;
            }
            powerOf2=powerOf2*2;
        }
        return decimal;
    }

}
