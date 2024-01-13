package Zoho;

public class IsPrime {
    public static void main(String args[]) {
        int n = 7;
        System.out.println(isPrime(n));
    }

    static boolean isPrime(int n) {
        for (int i = 2 ;i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}