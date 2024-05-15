import com.sun.org.apache.bcel.internal.generic.FSUB;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import javafx.util.Pair;
import sun.security.x509.InvalidityDateExtension;

import java.math.BigInteger;
import java.sql.SQLOutput;
import java.util.*;

public class Sample {

    public static void main(String[] args) {
        int[] arr={1,2,3,5};
        int k=3;
        System.out.println(Arrays.toString(kthSmallestPrimeFraction(arr, k)));
    }

    static public int[] kthSmallestPrimeFraction(int[] arr, int k) {

        int n = arr.length;

        PriorityQueue<int[]> pq = new PriorityQueue<>((x, y) -> Double.compare((double)y[0] / y[1], (double)x[0] / x[1]));

        for (int i = 0 ; i < n ; i++) {
            for  (int j = i+1 ; j < n ; j++) {
                pq.add(new int[] {arr[i], arr[j]});
                if (pq.size() > k) pq.poll();
            }
        }
        for(int[] i:pq){
            System.out.println(Arrays.toString(i));
        }
        return pq.peek();
    }

}


