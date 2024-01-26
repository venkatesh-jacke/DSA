package BitManupulation;

public class SetBits {
    public static void main(String[] args) {
        int n=84;
        System.out.println(countSetBits(n));
        System.out.println(brian_kerninghan(n));
        System.out.println(Integer.bitCount(n));
    }

/*    1.Approach
        Checking the last bit of the number if its a setbit than increment the count
        making right shift to 1 bit after checking the last bit
        doing it until the number < 0.
        Time Complexity is O(logN)
 */
    static int countSetBits(int n){
        int count=0;
        while(n>0){
            if((n&1)==1) count++;
            n>>=1;
        }
        return count;
    }

    /*    2.Approach (brian_kerninghan)
                Initialize a variable count to 0.
                Enter a while loop that continues until n becomes 0.
                Inside the loop, perform the operation n = n & (n-1).
                This operation clears the rightmost set bit in the binary representation of n.
                Increment the count variable.
                Repeat steps 2-4 until n becomes 0.
                Return the final count, which represents the number of set bits in the original value of n.
                The key idea behind this algorithm is that each iteration of the loop clears the rightmost set bit in n,
                and the loop continues until there are no more set bits.
                The number of iterations (and thus, the value of count) c
                orresponds to the number of set bits in the binary representation of the original number.
 */

    static int brian_kerninghan(int n){
        int count=0;
        while(n>0){
            n=n&(n-1);
            count++;
        }
        return count;
    }
}
