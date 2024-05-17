package BitManupulation;

public class MaximumAndValueInArray {
    public static void main(String[] args) {
        int arr[] = { 4, 8, 6, 2 };
        System.out.println(maximumAndValueInArray(arr));

    }

    public static int maximumAndValueInArray(int[] arr) {
        int res = 0;
        int mask = 0;

        for (int i = 31; i >= 0; i--) {
            mask = (1 << i) | res;
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
