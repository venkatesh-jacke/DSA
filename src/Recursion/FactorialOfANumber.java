package Recursion;

public class FactorialOfANumber {
    public static void main(String[] args) {
        System.out.println(fun(5));
    }

    public static int fun(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * fun(n - 1);
    }
}
