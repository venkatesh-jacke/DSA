package TreeMap;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        String s ="xaxxaxaxx";
        System.out.println(last2(s));
    }

   static public int last2(String str) {
        int c=0;
        String last=str.substring(str.length()-2);
       System.out.println(last);
        for(int i=0;i<str.length();i++){
            if(str.substring(i).startsWith(last)){
                c++;
            }
        }

        return c-1;
    }


}
