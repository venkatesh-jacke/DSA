package HashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDs {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(5);
        System.out.println("hashSet is " + hashSet);


        ArrayList<Integer> al = new ArrayList<>();
        al.add(6);
        al.add(6);
        al.add(7);
        al.add(7);
        al.add(8);
        al.add(9);
        al.add(10);
        System.out.println("ArrayList is " + al);


        //Search
        if (hashSet.contains(2)) {
            System.out.println("yes 2 is there inside the set");
        }
        hashSet.addAll(al); // add all collections
        System.out.println(hashSet);

        Iterator it = hashSet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }


/*
      Time Complexity:-

      insert O(1)
      search O(1)
      remove O(1)

      Note:-
      1.No duplicates because it implements the Set Interface.
      2.Internally it uses HashMap so the object entered is a key and the value is dummy which is same for all key.
      3.It stores the object with help of hashCode() and equals() method.
*/

}
