package Recursion;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        System.out.println(sumOfNaturalNumbers(5));
    }
    static int sumOfNaturalNumbers(int n){
        if(n==0)
            return 0;
        return sumOfNaturalNumbers(n-1)+n;

    }
}
