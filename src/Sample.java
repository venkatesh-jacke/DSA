import com.sun.org.apache.bcel.internal.generic.FSUB;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import sun.security.x509.InvalidityDateExtension;

import java.util.ArrayList;
import java.util.List;

public class Sample {

    public static void main(String[] args) {
        String text = "apple,banana,apple,orange,apple";

        // Replace only the first occurrence of "apple" with "pear"
        String replacedOnce = text.replace("apple", "pear");
        System.out.println("replace: " + replacedOnce);  // Output: pear,banana,apple,orange,apple

        // Replace all occurrences of "apple" with "pear"
        String replacedAll = text.replaceAll("apple", "pear");
        System.out.println("replaceAll: " + replacedAll);  // Output: pear,banana,pear,orange,pear
    }



}