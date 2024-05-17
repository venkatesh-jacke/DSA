package BitManupulation;

public class BinaryToDecimal {
    public static void main(String[] args) {
        System.out.println(binaryToDecimal("11111"));
    }

    public static int binaryToDecimal(String s) {
        int decimal = 0, powerOf2 = 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            decimal = decimal + ((s.charAt(i) == '1') ? powerOf2 : 0);
            powerOf2 *= 2;
        }
        return decimal;
    }
}
