package LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDS {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet= new LinkedHashSet<>();
        linkedHashSet.add(5);
        linkedHashSet.add(1);
        linkedHashSet.add(4);
        linkedHashSet.add(2);
        linkedHashSet.add(2);
        linkedHashSet.add(null);  //It can store null only one null it can store
        linkedHashSet.add(null);
        System.out.println(linkedHashSet);

        //LinkedHashSet will store the order of an element while we inserting
    }
}
