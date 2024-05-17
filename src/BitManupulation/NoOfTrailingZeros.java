package BitManupulation;

public class NoOfTrailingZeros {
    public static void main(String[] args) {
        int n = 2;
        int result = ((n & n - 1) ^ n);
        System.out.println((int)(Math.log10(result) / Math.log10(2)));
    }
}
