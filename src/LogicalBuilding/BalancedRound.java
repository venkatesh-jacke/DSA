package LogicalBuilding;

import java.util.Arrays;
import java.util.Scanner;

public class BalancedRound {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k= sc.nextInt();
            int arr[]= new int[n];
            for(int i=0;i<n;i++)arr[i]=sc.nextInt();
            System.out.println(balancedRound(arr,n,k));
        }
    }
    static int balancedRound(int[] arr,int n,int k){
        Arrays.sort(arr);
        int count=1;
        int ans=0;
        if(n==1) return 0;
        for(int i=0;i<n-1;i++){
            if(Math.abs(arr[i]-arr[i+1])<=k){
                count++;
            }
            else{
                count=1;
            }
            ans=Math.max(ans,count);
        }
        return n-ans;
    }
}
