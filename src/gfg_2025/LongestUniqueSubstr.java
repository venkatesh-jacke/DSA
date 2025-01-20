package gfg_2025;


//https://www.geeksforgeeks.org/problems/longest-distinct-characters-in-string5848/1
public class LongestUniqueSubstr {
    public static void main(String[] args) {
        String s = "abcdefabcbb";
        System.out.println(longestUniqueSubstr(s));
    }


    static public int longestUniqueSubstr(String s) {
        // code here
        int ans = 0;

        boolean[] vis = new boolean[26];
        for (int l = 0, r = 0; r < s.length(); r++) {
            char cur = s.charAt(r);
            while (vis[cur - 'a']) {
                vis[s.charAt(l) - 'a'] = false;
                l++;
            }
            vis[cur - 'a'] = true;
            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }

}
