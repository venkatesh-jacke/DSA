package LogicalBuilding;
//https://codeforces.com/problemset/problem/1900/A

import java.util.Scanner;

public class CoverInWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            System.out.println(coverInWater(s));
        }
    }

    static int coverInWater(String s) {
        int cnt = 0;
        int ans = 0;
        boolean foundThree = false;
        for (char ch : s.toCharArray()) {
            if (ch == '.') {
                cnt++;
                ans++;
            } else {
                cnt = 0;
            }
            if (cnt == 3) {
                foundThree = true;
                break;
            }

        }
        return foundThree ? 2 : ans;
    }
}
/*
Intuition

I have to find continuous 3 empty cells if i found one than i can break the loop and return 2 as i can replace the other cells with the water which i got from center cell
If i dont find any continuous three cells i have to fill individually


*/
