
    import java.sql.SQLOutput;
    import java.util.*;

    public class Codechef {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                long[] arr = new long[n];
                for (int i = 0; i < n; i++) arr[i] =sc.nextLong();
                System.out.println(selectK(arr));
            }

        }

        static long selectK(long[] arr) {
            long res = 2;

            while (true) {
                Set<Long> set = new HashSet<>();
                for (long i : arr) {
                    set.add( i % res);
                }
                if (set.size() == 2) break;
                res *= 2;
            }
            return res;
        }
    }


