package Math;

public class RightShift {
    public static void main(String[] args) {
       rightShift(5,1);
    }

    static void rightShift(int n, int bits) {
        System.out.println(n >>> bits);
    }
}
/*
Right Shift  >> (signed right shift) or (arithmatic right shift)
The filler value will be the MSB (Most Significant bit)
Sign is preserved
N=5
            128 64 32 16 8 4 2 1
5------>     0  0  0   0 0 1 0 1
2----->      0   0  0  0 0 0 1 0 1


It means n / (2 ^ bits)

Triple Right Shift >>> (unsigned right shift) (logical right shift)
The filler value will be 0
sign is not preserved



*/



