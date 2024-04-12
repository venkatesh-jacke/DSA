
import java.sql.SQLOutput;
import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            System.out.println(ballondor(n,arr));
        }
    }
    static String ballondor(int n, int[] arr) {
        int c=0;
        for(int i=0;i<n;i++){
            if(arr[i]==2){
                c++;
            }
        }
        if(c%8==0) return "YES";
        else return "NO";
    }
    static String pepBidding(int n, int[] attackA, int defenceA[], int[] attackB, int[] defenceB) {
        int sumofAttackA = 0;
        int sumofDefenceA = 0;
        int sumofAttackB = 0;
        int sumofDefenceB = 0;
        for (int i = 0; i < n; i++) sumofAttackA += attackA[i];
        for (int i = 0; i < n; i++) sumofDefenceA += defenceA[i];
        for (int i = 0; i < n; i++) sumofAttackB += attackB[i];
        for (int i = 0; i < n; i++) sumofDefenceB += defenceB[i];
        if (sumofAttackA > sumofAttackB && sumofDefenceA > sumofDefenceB) return "A";
        if (sumofAttackA < sumofAttackB && sumofDefenceA < sumofDefenceB) return "P";
        else return "Draw";
    }


}


