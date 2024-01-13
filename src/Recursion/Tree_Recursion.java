package Recursion;

public class Tree_Recursion {
    public static void main(String[] args) {
        Tree_Recursion obj = new Tree_Recursion();
        obj.fun(3);

    }
    void fun(int n){
        if(n>0){
            System.out.print(n+" ");
            fun(n-1);
            fun(n-1);
        }
    }
}
