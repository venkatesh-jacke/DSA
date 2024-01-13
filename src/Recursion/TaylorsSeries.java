package Recursion;

import javax.xml.soap.MimeHeader;

public class TaylorsSeries {
    double p = 1, f = 1,s=1;
    double r;

    public static void main(String[] args) {

        System.out.println(new TaylorsSeries().fun(1, 10));
        System.out.println(new TaylorsSeries().hornersRule(1, 10));
    }

    double fun(int x, int n) {
        if (n == 0) return 1;
        else {
            r = fun(x, n - 1);
            p = p * x;
            f = f * n;
            return r + p / f;

        }
    }

    double hornersRule(int x, int n) {
        if (n == 0) return s;
        s = 1 + x * s / n;
        return hornersRule(x, n - 1);

    }
}
