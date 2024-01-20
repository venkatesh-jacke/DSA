package TreeSet;

import java.util.TreeSet;

public class TreeSetDS {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet<>();
        ts.add(5);
        ts.add(4);
        ts.add(3);
        ts.add(2);
        ts.add(1);
        ts.add(5);
       // ts.add(null);  //NullPointerException


        System.out.println(ts);

        /*     It doesnt store duplicate values also it maintains the sorted order

         */
    }
}
