package Recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(sumOfNaturalNumbers(5));
    }

    static int sumOfNaturalNumbers(int n) {
        if (n == 1)
            return 1;
        return sumOfNaturalNumbers(n - 1) * n;

    }
}
/*
I/0 ---> 5


O/P ---> 120

EXP ---> 1 * 2 * 3 * 4 * 5 = 120
 */