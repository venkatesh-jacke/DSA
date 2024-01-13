package Recursion;

public class Head_Recursion {
    public static void main(String[] args) {
        Head_Recursion obj = new Head_Recursion();
        obj.fun(5);
    }
    void  fun(int n){
        if(n>0){
            fun(n-1);
            System.out.print(n+" ");
        }
    }
}
