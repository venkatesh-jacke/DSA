package BitManupulation;

public class NthPalindromicBinaryRepresentation {
    public static void main(String[] args) {
        System.out.println(nthPalindromicBinaryRepresentation(21));
        System.out.println(Integer.toBinaryString(nthPalindromicBinaryRepresentation(21)));
    }

    public static int nthPalindromicBinaryRepresentation(int n) {
        int len = 0, count = 0;
        while (count <= n) {
            len++;
            count = count + (int) Math.pow(2, (len - 1) / 2);
        }
        count -= (int) Math.pow(2, (len - 1) / 2);
        int ele = n - count - 1;
        int ans = (1 << (len - 1)) | (ele << (len / 2));
        ans = ans | reverseAllBits(ans,len);
        return ans;
    }

    static int reverseAllBits(int n,int len) {
        int rev = 0;
        int f = len-1, l = 0;
        while (f > l) {
            if ((n & (1 << f)) != 0) {
                rev = rev | (1 << l);
            }
            if ((n & (1 << l)) != 0) {
                rev = rev | (1 << f);
            }
            f--;
            l++;
        }
        return rev;
    }
}
