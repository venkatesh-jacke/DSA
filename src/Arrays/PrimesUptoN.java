package Arrays;

import java.util.ArrayList;
import java.util.List;

public class PrimesUptoN {
    public static void main(String[] args) {
        System.out.println(primesUptoN(12));
    }

    public static List<Integer> primesUptoN(int n) {
        List<Integer> res = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j * j<=i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) res.add(i);
        }
        return res;
    }
}
