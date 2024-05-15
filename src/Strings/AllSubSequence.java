package Strings;

public class AllSubSequence {
    public static void main(String[] args) {
        String s = "abc";
        //allSubSequence(s,"");
        powerSet(s);
    }

    static void allSubSequence(String s, String ans) {
        if (s.length() == 0) {
            if (ans.isEmpty()) System.out.println("empty");
            else System.out.println(ans);
            return;
        }
        allSubSequence(s.substring(1), ans + s.charAt(0));
        allSubSequence(s.substring(1), ans);
    }

    static void powerSet(String s) {
        for (int bits = 0; bits < (1 << s.length()); bits++) {
            String sub="";
            for (int i = 0; i < s.length(); i++) {
                if ((bits & (1 << i)) != 0) {
                    sub += s.charAt(i);
                }
            }
            if(sub.isEmpty()) System.out.println("empty");
            else System.out.println(sub);
        }
    }
}
