package CodeWars;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AreSame {
    public static void main(String[] args) {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11, 18};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361, 361};
        System.out.println(comp(a, b));
        System.out.println(comp2(a, b));
    }

    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null || a.length != b.length)
            return false;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : a) {
            map.put(i * i, map.getOrDefault(i * i, 0) + 1);

        }
        for (int i : b) {
            if (!map.containsKey(i) || map.get(i) == 0)
                return false;
            map.put(i, map.get(i) - 1);
        }
        return true;
    }


    public static boolean comp2(int[] a, int[] b) {
        if (a == null || b == null || a.length != b.length)
            return false;
        int[] sa = Arrays.stream(a).map(Math::abs).sorted().toArray();
        int[] sb = Arrays.stream(b).sorted().toArray();
        for (int i = 0; i < a.length; i++) {
            if (sa[i] * sa[i] != sb[i]) return false;
        }
       // Arrays.equals(sa,sb);
        return true;
    }
}
