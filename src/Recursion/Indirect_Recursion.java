package Recursion;

public class Indirect_Recursion {
    public static void main(String[] args) {
        Indirect_Recursion obj = new Indirect_Recursion();
        obj.funA(20);
    }

    void funA(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            funB(n - 1);

        }
    }

    void funB(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            funA(n / 2);
        }
    }
}
