package Math;

public class SumOfAllDivisors {
    public static void main(String[] args) {
        System.out.println(sumOfAllDivisors(6));
    }

    public static int sumOfAllDivisors(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println((n / i) * i);
            res += (n / i) * i;
        }
        return res;
    }
}
/*
Explanation of the problem:

The goal of this function is to calculate the sum of all divisors
 for every number from 1 to n.

 A divisor of a number i is any number that divides i without leaving
 a remainder. For example, divisors of 6 are: 1, 2, 3, and 6.
 So, the sum of divisors of 6 is 1 + 2 + 3 + 6 = 12.

  However, this problem is asking us to find the sum of all divisors
 for every number from 1 to n.

Example:
 For n = 6:
 - Divisors of 1 are: 1               -> sum = 1
 - Divisors of 2 are: 1, 2            -> sum = 1 + 2 = 3
 - Divisors of 3 are: 1, 3            -> sum = 1 + 3 = 4
 - Divisors of 4 are: 1, 2, 4         -> sum = 1 + 2 + 4 = 7
 - Divisors of 5 are: 1, 5            -> sum = 1 + 5 = 6
 - Divisors of 6 are: 1, 2, 3, 6      -> sum = 1 + 2 + 3 + 6 = 12

 Total sum of all divisors from 1 to 6 = 1 + 3 + 4 + 7 + 6 + 12 = 33
*/
