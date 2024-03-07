package CodeWars;

import java.util.Arrays;

public class ArrayDiff {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2}, new int[]{1})));

    }

    public static int[] arrayDiff(int[] a, int[] b) {
        return Arrays.stream(a)
                .filter(x -> Arrays.stream(b).noneMatch(y -> y == x))
                .toArray();
    }
}
