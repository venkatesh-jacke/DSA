package LogicalBuilding;

import java.util.Scanner;


//https://codeforces.com/problemset/problem/1896/A
public class JaggedSwaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(jaggedSwap(arr));
        }
    }

    static String jaggedSwap(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                swap(arr, i, i + 1);

            }
            min = Math.min(min, arr[i]);
        }
        return min == arr[0] ? "YES" : "NO";

    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
