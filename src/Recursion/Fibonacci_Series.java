package Recursion;

public class Fibonacci_Series {
    public static void main(String[] args) {

        System.out.println(fib(8));
        System.out.println(mFib(8));
    }
    static int fib(int n){
        if(n<=1) return n;
        return fib(n-2)+fib(n-1);
    }
    static int mFib(int n){
            int[] fibArray= new int[n+1];
            for (int i = 0; i <= n; i++) {
                fibArray[i] = -1; // Initialize the array with -1 values
            }
        if(n<=1) {
            fibArray[n] = n;
            return n;
        }
        else {
            if(fibArray[n-2]==-1) fibArray[n-2]=mFib(n-2);
            if(fibArray[n-1]==-1) fibArray[n-1]=mFib(n-1);
            return fibArray[n-2]+fibArray[n-1];
        }
    }
}
