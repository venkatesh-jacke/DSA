package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindANumberInMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of row");
        int row = sc.nextInt();
        System.out.println("Enter the no of column");
        int col = sc.nextInt();
        System.out.println("Enter the elements row wise");
        int arr[][] = new int[row][col];


        //inputs
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the target to search");
        int target = sc.nextInt();
        findANumberInMatrix(arr, target);
    }

    static void findANumberInMatrix(int[][] arr, int target) {

        for (int i = 0; i < arr.length; i++) { //arr.length will be size of row
            for (int j = 0; j < arr[i].length; j++) {  //arr[i].length will be the size of column
                if (arr[i][j] == target) {
                    System.out.println("Target found at " + i + " " + j);
                    return;
                }
            }
        }
        System.out.println("Target not present in the matrix");


    }
}
