package CodeForce;

import java.util.Scanner;

public class DontTryToCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            sc.nextLine();

            String x = sc.nextLine();
            String s = sc.nextLine();
            System.out.println(dontTryToCount(x, s));
        }
    }

    static int dontTryToCount(String x, String target) {
        int res = 0;
        int count=6;
        boolean flag=false;
        StringBuilder sb = new StringBuilder(x);
        while (count-->0) {
            if(sb.indexOf(target)!=-1){
                flag=true;
                break;
            }
            res++;
            sb.append(sb);
        }
        return flag?res:-1;
    }
}
