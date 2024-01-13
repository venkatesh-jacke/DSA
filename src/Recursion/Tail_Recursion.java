package Recursion;

public class Tail_Recursion {
    public static void main(String[] args) {
        Tail_Recursion obj = new Tail_Recursion();
        obj.fun(5);
    }
    void fun(int n){
        if(n>0){
            System.out.print(n+" ");
            fun(n-1);
        }
    }
}
