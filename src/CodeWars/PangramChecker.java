package CodeWars;

import java.util.*;
import java.util.Iterator;
import java.util.Map;

public class PangramChecker {

    public static void main(String[] args) {
        String s = "wkiqohnfultdrex ygskbjca smy vkpz t";
        String s2 = "You shall not pass!";
        System.out.println(check2(s2));
    }

    static public boolean check(String sentence) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char i : sentence.toCharArray()) {
            if (Character.isAlphabetic(i)) {
                int count = map.getOrDefault(i, 0);
                map.put(i, count + 1);
            }

        }
        if (map.size() >=27) return true;
        return false;
    }

    static public boolean check2(String sentence) {
       boolean arr[]= new boolean[26];
       sentence=sentence.toLowerCase();
        for (char i : sentence.toCharArray()) {
            if (Character.isAlphabetic(i)) {
               arr[i-'a']=true;
            }

        }
       for(boolean b:arr){
           if(!b) return false;
       }
       return  true;
    }

    static public boolean check3(String sentence) {
     return sentence.toLowerCase().chars().filter(Character::isLetter).distinct().count() == 26;

    }
}