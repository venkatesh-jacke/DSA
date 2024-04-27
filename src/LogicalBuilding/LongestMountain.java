package LogicalBuilding;


//https://www.naukri.com/code360/problems/longest-mountain-subarray_893069?leftPanelTabValue=SUBMISSION
public class LongestMountain {
    public static void main(String[] args) {
        int n = 4;
        int[] arr = new int[]{1,3,1,4,3,1};
        System.out.println(longestMountain(arr, arr.length));
    }


    //Time O(n)
    //Space O(1)
    public static int longestMountain(int arr[], int n) {
        int res = 0;

        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                int j = i;
                int cnt = 1;
                while (j > 0 && arr[j] > arr[j - 1]) {
                    j--;
                    cnt++;
                }
                int k = i;
                while (k < n - 1 && arr[k] > arr[k + 1]) {
                    k++;
                    cnt++;
                }
                res = Math.max(res, cnt);
            }

        }
        return res;
    }
}
