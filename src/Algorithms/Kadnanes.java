package Algorithms;

public class Kadnanes {
    public static void main(String[] args) {
        int[] arr = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] arr1 = new int[]{2, 6, 8, 1, 4};
        maxSubArray(arr);
        minSubArray(arr1);

    }


    static void maxSubArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        int cur_sum = 0;
        int start = 0;
        int end = 0;
        int s = 0;

        for (int i = 0; i < arr.length; i++) {
            cur_sum = cur_sum + arr[i];

            //update max_sum if cur_sum is greater
            if (cur_sum > max) {
                max = cur_sum;
                start = s; //update the start of max subArray
                end = i;  //update the end of max subArray
            }

            //if cur_sum is negative reset and start in next subArray
            if (cur_sum < 0) {
                cur_sum = 0;
                s = i + 1;
            }
        }
        System.out.println("start Index " + start);
        System.out.println("end Index " + end);
        System.out.println("max_sum is " + max);
    }

    static public int maxSubArray2(int[] nums) {
        int cur_sum = nums[0];
        int max_sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            cur_sum = Math.max(nums[i], cur_sum + nums[i]);
            max_sum = Math.max(max_sum, cur_sum);

        }
        return max_sum;
    }

    static void minSubArray(int[] arr) {
        int min_sum = Integer.MAX_VALUE;
        int cur_sum = 0;
        int start = 0;
        int end = 0;
        int s = 0;

        for (int i = 0; i < arr.length; i++) {
            cur_sum = cur_sum + arr[i];

            //min_sum should always be less than cur_sum so, update it
            if (cur_sum < min_sum) {
                min_sum = cur_sum;
                start = s;
                end = i;
            }
            if (cur_sum > 0) {
                cur_sum = 0;
                s = i + 1;
            }
        }
        System.out.println("start Index " + start);
        System.out.println("end Index " + end);
        System.out.println("min_sum is " + min_sum);
    }
}


/*
Properties:-
1. If all elements are positive than the max sub array will be the whole array itself.
2. If all elements are negative than the size of max sum array could be 1 which is value near to 0.
3. In an array there can be many sub array which gives a same max sum

Observation:-
If you see we are finding the  window length of arr which holds the max_sum
This is like sliding window technique where we don't know the window size initially

*/
