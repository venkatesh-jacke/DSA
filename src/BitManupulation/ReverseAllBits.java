package BitManupulation;

public class ReverseAllBits {
    public static void main(String[] args) {
        int n = 1;
        System.out.print("Original ");
        DecimalToBinary.dTob(n);
        System.out.println();
        System.out.println(reverseAllBits(n));
        System.out.print("Reverse ");
        DecimalToBinary.dTob(reverseAllBits(n));
    }


    //Time is O(logN)
    static int reverseAllBits(int n) {
        int rev = 0;
        int f = 31, l = 0;
        while (f > l) {
            if ((n & (1 << f)) != 0) {
                rev = rev | (1 << l);
            }
            if ((n & (1 << l)) != 0) {
                rev = rev | (1 << f);
            }
            f--;
            l++;
        }
        return rev;
    }
}
