package Math;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        sieveOfEratoshthenes(47);
    }


    //O(Nlog(logN))
    static void sieveOfEratoshthenes(int n) {
        boolean prime[] = new boolean[n + 1];
        for (int i = 2; i * i <= n; i++) {
          if(!prime[i]){
              for(int j=i*i;j<=n;j+=i){
                prime[j]=true;
              }
          }
        }
        for(int i=2;i<=n;i++){
            if(!prime[i]) System.out.println(i);
        }
    }
}
