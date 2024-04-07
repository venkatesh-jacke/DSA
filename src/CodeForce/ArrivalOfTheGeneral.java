package CodeForce;

import java.util.Scanner;

public class ArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();

        }
        int min = -1, max = -1;
        for (int i = 0; i < n; i++) {
            if (min == -1 || arr[i] <= arr[min]) {
                min = i;
            }
            if (max == -1 || arr[i] > arr[max]) {
                max = i;
            }

        }

        int ans;
        if (max < min) {
            ans = max + (n - min - 1);
        } else {
            ans = max + (n - min - 2);
        }
        System.out.println(ans);
    }
}


/*
n=7
           i              j
Index  0   1  2  3  4  5  6
Array  10 10 58 31 63 40 76

6-0=6
6-1=5

6+5=11

11-1=10

33 44 11 22


*/