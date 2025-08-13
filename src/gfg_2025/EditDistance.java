package gfg_2025;

//https://www.geeksforgeeks.org/problems/edit-distance3702/1

public class EditDistance {
    public static void main(String[] args) {
        String s1 = "abcd", s2 = "bcfe";
        System.out.println(editDistance(s1, s2));
    }

    static public int editDistance(String s1, String s2) {
        // Code here
        int[] freq = new int[26];
        int count = 0;
        for (char c : s2.toCharArray()) {
            freq[c - 'a']++;
        }
        for (char c : s1.toCharArray()) {
            if (freq[c - 'a'] < 1) {
                count++;
            } else {
                freq[c - 'a']--;
            }
        }
        for(int i:freq){
            if(i>0){
                count+=i;
            }
        }
        return count;
    }
}
