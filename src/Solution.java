//[1,4,3,3,2]
public class Solution {
    public static void main(String[] args) {
        int pos = 'w' - 'a';
        System.out.println(Math.min(pos, 26 - pos));
        System.out.println(findLexSmallestString("xaxcd",5));

    }

    static public int longestMonotonicSubarray(int[] nums) {
        int inc = 1, dec = 1, ans = 1, in = 1, de = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                inc++;
                dec = 1;
            } else if (nums[i] > nums[i + 1]) {
                dec++;
                inc = 1;
            } else {
                inc = 1;
                dec = 1;
            }
            in = Math.max(in, inc);
            de = Math.max(de, dec);
            ans = Math.max(in, de);
        }
        return ans;
    }

    public static String findLexSmallestString(String s, int k) {
        char[] charArray = s.toCharArray();
        int n = charArray.length;

        for (int i = 0; i < n; i++) {
            int distance = charArray[i] - 'a';
            int minChange = Math.min(distance, 26 - distance);
            if(k>0){
                if (minChange <= k) {
                    charArray[i] = 'a';
                }
                else{
                    System.out.println((char) (charArray[i]-k));
                    charArray[i] = (char) (charArray[i]-k);
                }
                k -= minChange;
            }


        }

        return new String(charArray);
    }


}