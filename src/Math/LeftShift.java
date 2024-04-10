package Math;

public class LeftShift {
    public static void main(String[] args) {
        leftShift(5,1);
    }

    static void leftShift(int n, int bit) {
        System.out.println(n << bit);
    }
}
/*
Left Shift
N=5
            128 64 32 16 8 4 2 1
5------>     0  0  0   0 0 1 0 1
10----->   0 0  0  0   0 1 0 1


It means n * (2 ^ bits)


*/
