package Recursion;

public class BinaryExponential {
    public static void main(String[] args) {
        System.out.println( fun(2,3));
    }
    public static final int  fun(int m,int n){
        if(n==0) return 1;
        if(n%2==0) return fun(m*m,n/2);
        else return fun(m*m,(n-1)/2)*m;
    }
}
