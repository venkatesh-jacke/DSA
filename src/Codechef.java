
import java.sql.SQLOutput;
import java.util.*;

public class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            System.out.println(fun(arr, n, x, y));

        }

    }

    static int fun(int[] arr, int n, int x, int y) {
        int sum = 0;
        for (int i : arr) {
            if ((i * x) <= y) sum += (i * x);
            else sum += y;
        }
        return sum;
    }


}


