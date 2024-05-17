package BitManupulation;

public class SwapEvenOddBits {
    public static void main(String[] args) {
        int n = 181;
        int result = ((n & 0xAAAAAAAA) >>> 1) | ((n & 0x55555555) << 1);

        System.out.println(result);
    }
}

/*
N= 181

original :-  1 0 1 1 0 1 0 1
Swapped  :-    0 1 1 1 1 0 1 0

(n & 0xAAAAAAAA) >>> 1)  This preserves the even bits
(n & 0x55555555) << 1    this preserves the odd bits

0xAAAAAAAA  :-  1 0 1 0 1 0 1 0  (even positions are set)

0x55555555  :-  0 1 0 1 0 1 0 1  (odd positions are set)

finally OR them and produce the result
*/
