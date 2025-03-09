package gfg_2025;

//https://www.geeksforgeeks.org/problems/count-palindrome-sub-strings-of-a-string0652/1
public class PalindromeSubstrings {
    public static void main(String[] args) {
        String s = "abaab";
        System.out.println(countPs(s));
    }

    public static int countPs(String s) {
        int n = s.length();
        int res = 0;
        for (int i = 0; i < n; i++) {
            int l = i, r = i;
            //Odd Length
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                res += (r - l + 1) > 1 ? 1 : 0;
                l--;
                r++;
            }
            l = i;
            r = i + 1;
            //Even Length
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                res += (r - l + 1) > 1 ? 1 : 0;
                l--;
                r++;
            }

        }
        return res;
    }
}
