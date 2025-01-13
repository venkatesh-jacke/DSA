package gfg;


//https://www.geeksforgeeks.org/problems/container-with-most-water0535/1

public class MaxWater2 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4, 5};
        System.out.println(maxWater(arr));
    }

    static public int maxWater(int arr[]) {

        int n = arr.length;
        int ans = 0;
        int l = 0, r = n - 1;

        while (l < r) {
            if (arr[l] < arr[r]) {
                ans = Math.max(ans, (r - l) * arr[l]);
                l++;
            } else {
                ans = Math.max(ans, (r - l) * arr[r]);
                r--;
            }
        }
        return ans;
    }
}
