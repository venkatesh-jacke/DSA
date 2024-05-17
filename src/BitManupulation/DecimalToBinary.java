package BitManupulation;

public class DecimalToBinary {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(decimalToBinary(n));
        dTob(n);
    }

    public static String decimalToBinary(int n) {
        String binary = "";
        while (n > 0) {
            binary = n % 2 + binary;
            n /= 2;
        }
        return binary;
    }

    public static void dTob(int n) {
        for (int i = 31; i >= 0; i--) {
            System.out.print((n >> i) & 1);
        }
    }
}
