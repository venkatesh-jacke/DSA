package gfg;


import java.util.Arrays;

//https://www.geeksforgeeks.org/problems/count-possible-triangles-1587115620/1
public class CountTriangles {
    public static void main(String[] args) {
        int[] arr = {4, 6, 3, 7};
        System.out.println(countTriangles(arr));
    }

    static int countTriangles_brute(int arr[]) {
        int n = arr.length;
        int triangles = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] > arr[k] && arr[i] + arr[k] > arr[j] && arr[k] + arr[j] > arr[i]) {
                        triangles++;
                    }
                }
            }
        }
        return triangles;
    }

    static int countTriangles(int arr[]) {
        Arrays.sort(arr); //If sorted need to chk only arr[i] + arr[j] > arr[k]
        int n = arr.length;
        int triangles = 0;
        for (int r = n - 1; r >= 2; r--) {  // since sorted big elements lie on end of an array
            int l = 0, mid = r - 1;
            while (l < mid) {
                if (arr[l] + arr[mid] > arr[r]) {
                    triangles += (mid - l);
                    mid--;
                } else {
                    l++;
                }
            }

        }
        return triangles;
    }
}
