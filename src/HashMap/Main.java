package HashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("1", 1); // adds the key "1"->1
        hashMap.put("1", 11); //updates the value "1"->2

        hashMap.putIfAbsent("2", 2);//adds the key "2"->2 only if the key "2" is absent
        hashMap.putIfAbsent("2", 22); //No change "2"->2

        hashMap.computeIfAbsent("3", k -> 3 * 10); //add the key "3"->300 since "3->30" was absent
        hashMap.computeIfAbsent("3", k -> 3 * 200); //no change "3"->300


        hashMap.computeIfPresent("4",(key,oldValue)->oldValue*100);//nothing happens because 4 is absent
        hashMap.put("4",4);// adds the key "4"->4
        hashMap.computeIfPresent("4",(key,oldValue)->oldValue*100);// updates the value "4"->400

        System.out.println((hashMap.get("6"))); // returns null 6 is not available
        System.out.println((hashMap.getOrDefault("6",0))); // returns 0 default value if  6 is not available


        System.out.println(hashMap);
    }
}
