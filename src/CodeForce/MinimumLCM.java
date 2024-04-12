package CodeForce;

import java.util.Scanner;

public class MinimumLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
           // int[] res = minimumLcm(n);
            int[] res2 = minimumLcm2(n);
            System.out.println(res2[0] + " " + res2[1]);
        }
    }

    static int[] minimumLcm(int n) {
        int[] res = new int[2];
        int a = 1, b = n - 1, minA = 1, minB = n - 1;
        long minLcm = Integer.MAX_VALUE;
        while (a < n - 1 && b > 1) {
            if (a == a / 2) break;
            long lcm = lcm(a, b);
            if (lcm < minLcm) {
                minLcm = lcm;
                minA = a;
                minB = b;
            }
            a++;
            b--;
        }
        res[0] = minA;
        res[1] = minB;
        return res;
    }

    static int[] minimumLcm2(int n) {
        int[] res = new int[2];
        int a = 1;
        for (int i=2;i*i<=n;i++) {
            if(n%i==0){
                a=n/i;
                break;
            }
        }
        res[0] = a;
        res[1] = n-a;
        return res;
    }

    static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }

    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
}
