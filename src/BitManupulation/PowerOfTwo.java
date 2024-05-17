package BitManupulation;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n=512;
        if(n==0) System.out.println("No");
        else if((n&(n-1))== 0) System.out.println("Yes");
        else System.out.println("No");
    }
}
/*
Intuition

1.If a number is a power of 2 it has only 1 set bit.
So we use Brian Kernighan's algo to find the set bit. (so the existing set bit will vanish and it will become zero.

*/
