import com.sun.org.apache.bcel.internal.generic.FSUB;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import sun.security.x509.InvalidityDateExtension;

import java.util.ArrayList;
import java.util.List;

public class Sample {

    public static void main(String[] args) {

        System.out.println(groupSum6(0, new int[]{2, 4, 8}, 14));


    }


    static boolean groupSum6(int start, int[] nums, int target) {
        if (start >= nums.length)
            return target == 0;
        if (nums[start] == 6) return groupSum6(start + 1, nums, target - nums[start]);
        return groupSum6(start + 1, nums, target - nums[start]) || groupSum6(start + 1, nums, target);
    }
}