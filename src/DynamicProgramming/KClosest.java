package DynamicProgramming;

import java.util.Arrays;
import java.util.PriorityQueue;

//https://www.geeksforgeeks.org/problems/k-closest-points-to-origin--172242/1

public class KClosest {
    public static void main(String[] args) {
        int[][] points = new int[][]{{1, 3}, {-2, 2}, {5, 8}, {0, 1}};
        int k=2;
        System.out.println(Arrays.deepToString(kClosest(points, k)));
    }

    static public  int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) ->
                Integer.compare((b[0] * b[0] + b[1] * b[1]), (a[0] * a[0] + a[1] * a[1])));

        for (int[] point : points) {
            maxHeap.offer(point);
            if (maxHeap.size() > k) {
                maxHeap.poll();  // Remove farthest point
            }
        }

        int[][] result = new int[k][2];
        int i = 0;
        while (!maxHeap.isEmpty()) {
            result[i++] = maxHeap.poll();
        }

        return result;
    }
}
