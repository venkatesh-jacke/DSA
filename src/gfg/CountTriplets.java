package gfg;


//https://www.geeksforgeeks.org/problems/count-all-triplets-with-given-sum-in-sorted-array/1

public class CountTriplets {
    public static void main(String[] args) {
        int[] arr = {-3, -1, -1, 0, 1, 2};
        int target = -2;
        System.out.println(countTriplets(arr, target));
    }

    static int countTriplets(int[] arr, int target) {
        // Code Here
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1, right = n - 1;
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum < target) {
                    left += 1;
                } else if (sum > target) {
                    right -= 1;
                } else {
                    int e1 = arr[left], e2 = arr[right];
                    int cnt1 = 0, cnt2 = 0;

                    while (left <= right && arr[left] == e1) {
                        left++;
                        cnt1++;
                    }

                    while (left <= right && arr[right] == e2) {
                        right--;
                        cnt2++;
                    }

                    if (e1 == e2) {
                        count += (cnt1 * (cnt1 - 1)) / 2;
                    } else {
                        count += cnt1 * cnt2;
                    }
                }
            }
        }
        return count;
    }
}
