package LogicalBuilding;

import java.util.Scanner;


//https://codeforces.com/problemset/problem/1903/A
public class Halloumi_Boxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            System.out.println(halloumiBoxes(arr, k));
        }
    }

    static String halloumiBoxes(int[] arr, int k) {
        if (k > 1) return "YES";
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1] ) return "NO";
        }
        return "YES";
    }
}

/*
Intuition

The idea is if k>1 we can swap the values and get it sorted
if k<=1 and if arr is already sorted than say "YES"
if not we check the array if not sorted for k>=1 than say "NO"

*/
