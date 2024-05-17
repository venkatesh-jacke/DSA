package BitManupulation;

public class AllSubSequencesOfAString {

    public static void main(String[] args) {
      powerSet("abc");
    }

    static void powerSet(String s) {
        for (int bits = 0; bits < (1 << s.length()); bits++) {
            String subSequence = "";
            for (int i = 0; i < s.length(); i++) {
                if ((bits & (1 << i)) != 0) {
                    subSequence += s.charAt(i);
                }
            }
            if (subSequence.isEmpty()) System.out.println("Empty {}");
            else System.out.println(subSequence);
        }
    }
}
