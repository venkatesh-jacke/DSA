import java.sql.SQLOutput;
import java.util.*;

public class Sample {
    public static void main(String[] args) {

    }

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        // Write your code here
        List<Integer> res = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        k = k % a.size();

        for (int i = a.size() - k; i < a.size(); i++) {
            arr.add(a.get(i));
        }
        for (int i = 0; i < a.size() - k; i++) {
            arr.add(a.get(i));
        }
        System.out.println(arr);

        for (int q : queries) {
            res.add(a.get(q));
        }
        return res;
    }
}