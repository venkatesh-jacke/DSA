package gfg_2025;


//https://www.geeksforgeeks.org/problems/powx-n/1

public class Power {
    public static void main(String[] args) {
        double b = -0.67000;
        int e = -7;
        System.out.println(power(b, e));
    }

    static double power(double b, int e) {
        // code here
        return Math.pow(b, e);
    }

    static double power2(double b, double e) {
        if (e == 0) return 1;
        if (e < 0) return 1 / power2(b, e);
        double half = power2(b, e / 2);
        if (e % 2 == 0) {
            return half * half;
        } else {
            return b * half * half;
        }
    }
}
