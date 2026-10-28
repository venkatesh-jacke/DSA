import java.sql.SQLOutput;
import java.util.*;

public class Sample {
    public static void main(String[] args) {
        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days = 5;
        System.out.println(shipWithinDays(weights, days));
    }

    static public int shipWithinDays(int[] weights, int days) {
        int high = 0;
        int low = 0;
        for (int i : weights) {
            high += i;
            low = Math.min(low, i);
        }
        int mid =0;
        while (low <= high) {
             mid = (low + high) / 2;
            if (canShip(weights, mid, days)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    static boolean canShip(int[] weight, int capacity, int days) {
        int currentWeight = 0;
        int daysCount = 1;
        int i;
        for (i=0;i<weight.length;i++){
            currentWeight+=weight[i];
            if(currentWeight>capacity){
                daysCount++;
                currentWeight=0;
            }
        }
        return i==weight.length && daysCount <= days;
    }
}

