package Recursion;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibo(7));


        System.out.println(0);
        System.out.println(1);
        int n=7;
        fibSeries(0,1,n-1);
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
}
