package BitManupulation;

//https://www.geeksforgeeks.org/dsa/maximum-value-pair-array/

//Video Reference- https://www.youtube.com/watch?v=5babiA-TYhU

public class MaximumAndValueInArray {
    public static void main(String[] args) {
        int arr[] = { 4, 8, 6, 2 };
        System.out.println(maximumAndValueInArray(arr));

    }

    public static int maximumAndValueInArray(int[] arr) {
        int res = 0;
        int mask = 0;

        for (int i = 31; i >= 0; i--) {
            // Temporarily try adding the current bit to our answer.
            mask = (1 << i) | res;
            // If at least 2 numbers contain ALL bits in mask,
            // then this bit can be part of the final AND.
            if (countSetBits(arr, mask) >=2 ) {
                res = res | mask;
            }
        }
        return res;
    }

    public static int countSetBits(int[] arr, int mask) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if ((mask & arr[i]) == mask) {
                count++;
            }
        }

        return count;
    }
}
