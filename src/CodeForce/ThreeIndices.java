package CodeForce;

import java.util.Scanner;

//https://codeforces.com/problemset/problem/1380/A
public class ThreeIndices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            threeIndices(n, arr);
        }
    }

    static void threeIndices(int n, int[] arr) {

        int a = -2;
        int b = -2;
        int c = -2;
        boolean f=false;
        for(int i=1;i<n-1;i++){
            if(arr[i-1]<arr[i]&&arr[i]>arr[i+1]){
                a=i;
                b=i+1;
                c=i+2;
                f=true;
                break;
            }
        }
        if(!f) System.out.println("NO");
        else {
            System.out.println("YES");
            System.out.println(a+" "+b+" "+c);
        }

    }
}
