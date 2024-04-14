package Math;

public class RightMostSetBit {
    public static void main(String[] args) {
        rightMostSetBit(0);
        rightMostSetBit2(40);
    }


    //O(logN)
    static void rightMostSetBit(int n) {
        int mask = 1;
        int pos = 1;
        if (n == 0) {
            System.out.println(-1);
            return;
        }
        while ((n & mask) == 0) {
            mask = mask << 1;
            pos++;
        }
        System.out.println(pos);
    }

    static void rightMostSetBit2(int n) {
        int mask = n & (n - 1);
        n = n ^ mask;
        System.out.println(n);
    }
}
/*

Given a value N
create a mask (mask=(n&(n-1)))
perform XOR between n ^ m and reassign it to N
the updated value of N will have only one setbit which will be right right most setbit.
*/
