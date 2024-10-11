package HashMap;

public class TestHashMap {
    public static void main(String[] args) {
        MyHashMap<String,Integer> hashMap= new MyHashMap();
        hashMap.put("a",1);
        System.out.println(hashMap);
        hashMap.put("b",2);
        System.out.println(hashMap);
        hashMap.put("c",3);
        System.out.println(hashMap);
        System.out.println(hashMap.get("a"));
    }
}
