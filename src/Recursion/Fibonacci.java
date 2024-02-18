package Recursion;

public class Fibonacci {

    public static void main(String[] args) {
        int n=7;
        System.out.println(fibo(n));

        System.out.println(0);
        System.out.println(1);
        fibSeries(0,1,n-1);

        System.out.println(memoFib(n));

    }
    static int fibo(int n){
        if(n<=1) return n;
        return fibo(n-2)+fibo(n-1);
    }
    static void fibSeries(int a,int b,int n){
        if(n==0)
            return;
        int c=a+b;
        System.out.println(c);
        fibSeries(b,c,n-1);
    }

    static int memoFib(int n){
        int[] fibArray= new int[n+1];
        for (int i = 0; i <= n; i++) {
            fibArray[i] = -1; // Initialize the array with -1 values
        }
        if(n<=1) {
            fibArray[n] = n;
            return n;
        }
        else {
            if(fibArray[n-2]==-1) fibArray[n-2]=memoFib(n-2);
            if(fibArray[n-1]==-1) fibArray[n-1]=memoFib(n-1);
            return fibArray[n-2]+fibArray[n-1];
        }
    }
}
/*
I/0 ---> 5


O/P ---> 0 1 1 2 3 5 8 13

 */