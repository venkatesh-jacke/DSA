package CodeWars;

import java.util.HashMap;
import java.util.TreeMap;

public class RomanConversion {
    public static void main(String[] args) {
        System.out.println(solution2(4));
    }

    static public String solution(int n) {
        TreeMap<Integer, String> map = new TreeMap<>();
        StringBuilder sb = new StringBuilder();
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");
        for (int decimal : map.descendingKeySet()) {
            while (n >= decimal) {
                sb.append(map.get(decimal));
                n -= decimal;
            }
        }
        return sb.toString();
    }

    static public String solution2(int n) {
        StringBuilder sb = new StringBuilder();
        String digit[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String ten[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String hundred[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String thousand[] = {"", "M", "MM", "MMM"};
        return thousand[n / 1000] + hundred[n % 1000 / 100] + ten[n % 100 / 10] + digit[n % 10];
    }


}

/*
DRY RUN
N=1904

1904/1000 = 1 --->thousand[1] = M
(1904%1000)/100 = 904/100 ---> hundred[9] = CM
(1904%100)/10 = 4/10 = 0 ---> ten[0] = ""
1904%10 = 4 ---> digit[4] ="IV"

Result ---> MCMIV
*/
