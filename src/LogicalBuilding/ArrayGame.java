package LogicalBuilding;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            BigInteger[] arr = new BigInteger[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextBigInteger();
            System.out.println(arrayGame(arr, k));

        }
    }


    static BigInteger arrayGame(BigInteger[] arr, long k) {
        Arrays.sort(arr);
        if (k >2) return BigInteger.ZERO;
        BigInteger minEle=arr[0];
        BigInteger minDiff=arr[0].subtract(arr[1]).abs();
        for(int i=1;i<arr.length-1;i++){
            minDiff = minDiff.min(arr[i].subtract(arr[i + 1]).abs());
        }
        System.out.println("MinElememt is "+minEle);
        System.out.println("MinDiff is "+minDiff);
        return minDiff.min(minEle);
    }

}
