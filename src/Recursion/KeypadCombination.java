package Recursion;

import java.util.HashMap;

public class KeypadCombination {
    static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mnop", "qrs", "tu", "vwx", "yz"};

    public static void main(String[] args) {
        String str = "23";
        printCombo(str, 0, "");

    }

    static void printCombo(String str, int ind, String combo) {

        if (ind == str.length()) {
            System.out.println(combo);
            return;
        }
        char cur = str.charAt(ind);
        String mapping = keypad[cur - '0'];
        for (int j = 0; j < mapping.length(); j++) {
            printCombo(str, ind + 1, combo + mapping.charAt(j));
        }

    }
}
