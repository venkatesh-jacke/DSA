package Recursion;

public class PrintNumbers {
    public static void main(String[] args) {
        printNumbers2(5);
        printNumbers(5);
    }

    static void printNumbers(int n) {

        if (n == 0)
            return;
        System.out.println(n);
        printNumbers(n - 1);
    }

    static void printNumbers2(int n) {

        if (n == 0)
            return;
        printNumbers2(n - 1);
        System.out.println(n);
    }
}
