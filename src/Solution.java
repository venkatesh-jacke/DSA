import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 0, 0, 0, 3, 6};

        System.out.println(Arrays.toString(moveZeros(arr)));

    }

    static int[] moveZeros(int[] arr) {
        int n = arr.length;
        int c = 0;

        for (int i = 0; i <n; i++) {
            if (arr[i] != 0) {
                arr[c++] = arr[i];
            }
        }
        while(c<n){
            arr[c++]=0;
        }
        return arr;
    }
}