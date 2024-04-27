package LogicalBuilding;

import java.util.*;

public class DoremyPaint3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            System.out.println(doremyPaint(arr));
        }
    }

    static String doremyPaint(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) map.put(i, map.getOrDefault(i, 0) + 1);
        if (map.size() == 1) return "YES";
        if (map.size() > 2) return "NO";

        int count = 0;
        int temp[]= new int[2];
        for(int value:map.values()){
            temp[count++]=value;
        }
        int diff = Math.abs(temp[0]-temp[1]);
        if(diff<=1) return "YES";
        else return "NO";

    }
}
