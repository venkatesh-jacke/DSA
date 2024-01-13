package Recursion;

public class Nested_Recursion {
    public static void main(String[] args) {
        Nested_Recursion obj = new Nested_Recursion();
        System.out.println(obj.fun(95));
    }
    int fun(int n){
        if(n>100){
            return n-10;
        }
        else{
            return fun(fun(n+11));
        }
    }
}
