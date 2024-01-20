package HashMapDS;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDS {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap= new HashMap<String, Integer>();
        hashMap.put("a",1);
        hashMap.put("b",2);
        hashMap.put("c",3);
        hashMap.put("d",4);
        hashMap.put("e",5);
        hashMap.put(null,7); // hashmap can store null as a key but only one null key it can hae
        hashMap.put(null,8); //this line will update the value for that key

        System.out.println(hashMap);


        for(Map.Entry<String,Integer> e:hashMap.entrySet()){
            System.out.print(e.getKey()+" ");
            System.out.print(e.getValue()+" ");
        }

    }
}
