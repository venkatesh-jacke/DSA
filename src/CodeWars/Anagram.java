package CodeWars;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        a = a.toLowerCase();
        b = b.toLowerCase();
        int ac = 0;
        int bc = 0;
        for (int i = 0; i < a.length(); i++) {
            ac = 0;
            bc = 0;
            char c = a.charAt(i);
            for (int j = 0; j < b.length(); j++) {
                if (c == a.charAt(j)) ac++;
                if (c == b.charAt(j)) bc++;
            }
        }
        return ac == bc;
    }

    static boolean isAnagram2(String a, String b) {
        char ca[] = a.toCharArray();
        char cb[] = b.toCharArray();
        Arrays.sort(ca);
        Arrays.sort(cb);
        return Arrays.equals(ca, cb);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = "race";
        String b = "care";
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
        System.out.println(isAnagram2(a,b));
    }
}