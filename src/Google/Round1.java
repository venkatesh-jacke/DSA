package Google;

public class Round1 {

    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5};
        int energy = 1;
        System.out.println(fun(arr, energy, 0, 0));

    }

    static int fun(int[] arr, int energy, int i, int max) {
        if (energy == 0 || i >= arr.length) {
            return max;
        }
        int rest = fun(arr, energy + 1, i + 1, max);

        int sail = fun(arr, energy - 1, i + 1, max + arr[i]);
        int result = Math.max(rest, sail);

        return result;
    }
}