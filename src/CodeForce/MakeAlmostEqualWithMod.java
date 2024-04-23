package CodeForce;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


//https://codeforces.com/problemset/problem/1909/B
public class MakeAlmostEqualWithMod {
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

/*
Answer is going to be one of the power of 2

AnyNumber % 2  Reminder will be 0,1
AnyNumber % 4  Reminder will be 0,1,2,3
AnyNumber % 8  Reminder will be 0,1,2,3,4,5,6,7


Dry run
5
60 90 98 120 308


Lets Take res = 2
  - 60 % 2 = 0
  - 90 % 2 = 0
  - 98 % 2 = 0
  - 120 % 2 = 0
  - 308 % 2 = 0
Lets Take res = 4
  - 60 % 4 = 0
  - 90 % 4 = 2
  - 98 % 4 = 2
  - 120 % 4 = 0
  - 308 % 4 = 0
Lets Take res = 8
  - 60 % 8 = 4
  - 90 % 8 = 2
  - 98 % 8 = 2
  - 120 % 8 = 0
  - 308 % 8 = 4
*/
