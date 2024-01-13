package Recursion;

public class Sum_Of_First_N_Natural_Numbers {
    public static void main(String[] args) {
        Sum_Of_First_N_Natural_Numbers obj = new Sum_Of_First_N_Natural_Numbers();
        System.out.println(obj.fun(5));
    }
    int fun(int n){
        if(n<0){
            return 0;
        }
        else{
            return fun(n-1)+n;
        }
    }
}
