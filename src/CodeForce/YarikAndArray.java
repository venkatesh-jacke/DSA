package CodeForce;

import java.util.Scanner;


//https://codeforces.com/problemset/problem/1899/C
public class YarikAndArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            System.out.println(yarikAndArray(arr, n));
        }
    }

    static int yarikAndArray(int arr[], int n) {
        int maxSum = arr[0];
        int sum = arr[0];
        for (int i = 1; i < n; i++) {
            if ((arr[i] & 1) == (arr[i - 1] & 1))
                sum = arr[i];
            else
                sum = Math.max(arr[i], sum + arr[i]);
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;

    }
}
