package CodeWars;

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

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}