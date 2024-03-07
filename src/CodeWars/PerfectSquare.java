package CodeWars;

public class PerfectSquare {
    public static void main(String[] args) {
        System.out.println(isSquare(16));
    }
 public static boolean isSquare(int n) {
        double sqrt=Math.sqrt(n);
        return sqrt==Math.floor(sqrt);
     //return Math.sqrt(n)%1 == 0;
    }
}
/*
Math.floor()

floor gives a value less than or equal to the argument and is equal to a mathematical integer.
4.111->4.0
4.344->4.0
4.778->4.0
4.9->4.0
*/
