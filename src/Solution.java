

import java.io.*;
import java.sql.SQLOutput;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args)	{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            String s = sc.next();
            if(fun(s)){
                System.out.println("Happy");
            }else{
                System.out.println("Sad");
            }
            t--;

        }
    }

    private static boolean fun(String s) {
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                c++;
            }
            if (c == 3) {
                return true; // Return true as soon as three vowels are found
            }
        }
        return false; // Return false if less than three vowels are found
    }


}