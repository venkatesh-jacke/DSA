package Math;

public class PrimeFactors {
    public static void main(String[] args) {
        int n = 12;
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
/*
N = 40
 i=2

40 % 2==0  sout(2)
40/2 == 20
20%2==0   sout(2)
20/2 =10
10%2==0  sout(2)
10/2 == 5
i=5
5%5 =0 sout(5)
5/5=1 stop

13
























*/
