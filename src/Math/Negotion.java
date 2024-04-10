package Math;

public class Negotion {
    public static void main(String[] args) {
        negotion(-2);
    }

    static void negotion(int n) {
        System.out.println(~n);
    }
}
/*

-n = - (n+1)

~2 = -(2+1) => -3
-(-2) = -(-2+1) => 1


*/
