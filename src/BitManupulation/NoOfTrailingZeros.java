package BitManupulation;

public class NoOfTrailingZeros {
    public static void main(String[] args) {
        int n = 10;
        int result = ((n & n - 1) ^ n);
        System.out.println((int)(Math.log10(result) / Math.log10(2)));
    }
}
/*
n & (n-1)       → remove rightmost 1
XOR with n      → get rightmost 1
log₂(result)    → count trailing zeros
*/