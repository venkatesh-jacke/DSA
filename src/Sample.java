import com.sun.org.apache.bcel.internal.generic.FSUB;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import sun.security.x509.InvalidityDateExtension;

import java.sql.SQLOutput;
import java.util.*;

public class Sample {

    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {3, 1, 2, 4, 5},
                {1, 2, 3, 4},
                {3, 4, 5, 6}
        };
        System.out.println(intersection(arr));

    }

    static public List<Integer> intersection(int[][] arr) {
        List<Integer> res= new ArrayList<>();

        for (int[] i : arr) {
            Arrays.sort(i);
            System.out.println(Arrays.toString(i));
        }
        return res;
    }
}