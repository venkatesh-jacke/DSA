package CodeForce;


import java.util.Scanner;

//https://codeforces.com/problemset/problem/1899/A
public class GameWithIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(gameOfIntegers(n));
        }
    }

    static String gameOfIntegers(int n) {
        String res = "Second";
        if ((n - 1) % 3 == 0 || (n + 1) % 3 == 0) return "First";
        return res;
    }
}
