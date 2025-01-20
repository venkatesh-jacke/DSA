package gfg_2025;


//https://www.geeksforgeeks.org/problems/pair-with-given-sum-in-a-sorted-array4940/1
public class CountPairs2 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1};
        int target = 2;
        System.out.println(countPairs(arr, target));
    }

    static int countPairs(int arr[], int target) {
        // Complete the function
        int n = arr.length;
        int left = 0, right = n - 1;
        int pairs = 0;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                int cnt1 = 0, cnt2 = 0;
                int ele1 = arr[left], ele2 = arr[right];
                while (left <= right && arr[left] == ele1) {
                    left++;
                    cnt1++;
                }
                while (left <= right && arr[right] == ele2) {
                    right--;
                    cnt2++;
                }
                if (ele1 == ele2) {
                    pairs += (cnt1 * (cnt1 - 1)) / 2;
                } else {
                    pairs += (cnt1 * cnt2);
                }
            }

        }
        return pairs;

    }
}
