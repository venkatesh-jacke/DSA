package Recursion;

public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println(getNthItem(4,2));

    }
    static int getNthItem(int n,int r){
        if(r==0||n==r) return 1;
        return getNthItem(n-1,r-1)+getNthItem(n-1,r);
    }
}
/*
        1
       1 1
      1 2 1
     1 3 3 1
    1 4 6 4 1

         0C0
      1C0  1C1
    2C0  2C1  2C2
  3C0  3C1  3C2  3C3
4C0  4C1  4C2  4C3  4C4


*/
