package CodeForce;

import java.util.Scanner;


//https://codeforces.com/problemset/problem/1877/A
public class GoalsOfVictory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int res=0;
            for (int i = 0; i < n-1; i++){
                int value=sc.nextInt();
                arr[i] = value;
                res+=value;
            }
            System.out.println(res*-1);

        }
    }

}
