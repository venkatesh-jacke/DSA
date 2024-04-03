package CodeWars;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;

public class FirstNonRepeatingLetter {
    public static void main(String[] args) {
        System.out.println(firstNonRepeatingLetter("I Like To Take Candy From A Baby"));
    }

    public static String firstNonRepeatingLetter(String s) {
        String str = s.toLowerCase();
        char[] ca = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(ca[i]) == str.lastIndexOf(ca[i])) {
                return String.valueOf(s.charAt(i));
            }
        }
        return "";
    }

    public static String firstNonRepeatingLetter2(String s) {

        for (String str : s.split("")) {
            if (s.toUpperCase().indexOf(str.toUpperCase()) == s.toUpperCase().lastIndexOf(str.toUpperCase())) return str;

        }
        return "";
    }

}
