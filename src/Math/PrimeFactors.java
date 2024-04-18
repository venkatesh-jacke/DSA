package Math;

public class PrimeFactors {
    public static void main(String[] args) {
        int n = 100;
        primeFactors(n);
    }

    static void primeFactors(int n) {
        int i = 2;
        while (i * i <= n) {
            while (n % i == 0) {
                System.out.println(i);
                n /= i;
            }
            i++;
        }
        if (n > 1) System.out.println(n);
    }
}
