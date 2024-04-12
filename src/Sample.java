import com.sun.org.apache.bcel.internal.generic.FSUB;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import sun.security.x509.InvalidityDateExtension;

import java.util.ArrayList;
import java.util.List;

public class Sample {

    public static void main(String[] args) {
        System.out.println(truncateSentence( "chopper is not a tanuki",5));
    }
   static public String truncateSentence(String s, int k){
       int c = 0;
       int i = 0;
       StringBuilder sb= new StringBuilder("");

       while (c < k  && i<s.length())  {
           char cur= s.charAt(i++);
           if (cur == ' ') {
               c++;
               if(c<k) sb.append(cur);
           }

           else sb.append(cur);


       }
       return sb.toString();
   }


}