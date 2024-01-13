package Zoho;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 12;
        int ans = 0;
        while (n > 0) {
            ans += n % 10;
           n /= 10;
        }
        System.out.println(ans);
    }
}
