package Arrays;

import java.util.*;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals={{1,4},{6,7},{4,5}};
        System.out.println(Arrays.deepToString(mergeIntervals(intervals)));

    }
   static int[][] mergeIntervals(int[][] arr) {
        // add your logic here
        List<int[]> list = new ArrayList<>();
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        list.add(arr[0]); // add first interval initially
        for(int i=1;i<arr.length;i++){
            int[] cur= arr[i];
            int[] prev= list.get(list.size()-1);
            if(cur[0]<= prev[1]){
                prev[1]=Math.max(prev[1],cur[1]); //take maximum ending
            }
            else{
                list.add(cur); // no overlap
            }
        }
        int[][] merged = new int[list.size()][2];
        for(int i=0;i<list.size();i++){
            merged[i]=list.get(i);
        }

        return merged;
    }
}
