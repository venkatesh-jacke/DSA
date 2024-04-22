package CodeForce;

import java.util.Scanner;

//https://codeforces.com/problemset/problem/1692/G
public class TwoPowerSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++) arr[i]=sc.nextInt();
            System.out.println(twoPowerSort(n,k,arr));
        }
    }
    static int twoPowerSort(int n, int k,int[] arr){
        int ans=0;
        int count=1;
        for(int i=1;i<n;i++){
            if(arr[i-1]<2*arr[i]){
                count++;
            }
            else{
                count=1;
            }
            if(count>k)ans++;
        }
        return ans;
    }
}
/*
(2^m * a[i])  < (2^m+1 a[i+1])
cancel 2^m on both side
a[i] < 2*a[i+1]

*/
