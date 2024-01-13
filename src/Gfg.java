import java.lang.reflect.Array;
import java.util.*;

public class Gfg {

    static String reverseWords(String s) {
       char[] ca=s.toCharArray();
        int l=ca.length;

        if(l<=1 || ca==null) return s;
      return s;
    }

    public static void main(String[] args) {
        String s = "one two three";
        System.out.println(reverseWords(s));
    }
}