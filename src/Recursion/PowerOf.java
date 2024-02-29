package Recursion;

public class PowerOf {
    public static void main(String[] args) {
        System.out.println(powerOf(2,10));
        System.out.println(powerOf_2(2,10));

    }

    //Time Complexity is O(N) size of stack
    static int powerOf(int x, int n){
        if(n==1)
            return x;
        return x* powerOf(x,n-1);

    }


    //Time Complexity is O(logN) size of stack
    static int powerOf_2(int x,int n){
        if(n==1) return x;
        if(n%2==0) return powerOf_2(x,n/2)*powerOf_2(x,n/2);
        else return  powerOf_2(x,n/2)*powerOf_2(x,n/2)*x;
    }
}
