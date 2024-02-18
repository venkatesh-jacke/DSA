package Recursion;

import java.util.Arrays;

public class FirstAndLastOccurance {
    public static void main(String[] args) {
        String str = "xabcdaxcd";
        char x = 'x';
        System.out.println(Arrays.toString(firstAndLastOccurance(str, 0, x, -1, -1)));
    }

    static int[] firstAndLastOccurance(String str, int idx, char ch, int first, int last) {


        if (idx == str.length()) return new int[]{first, last};
        if (str.charAt(idx) == ch && first == -1) first = idx;
        if (str.charAt(idx) == ch && first != -1) last = idx;
        return firstAndLastOccurance(str, idx + 1, ch, first, last);

    }
}

/*
I/0 ---> "xabcdaxcd"   "x"


O/P ---> [0, 6]

 */
