package Recursion;


//Place Tiles of size 1*m  in a floor of size n*m
public class PlaceTiles {
    public static void main(String[] args) {
        int n=4;
        int m=2;
        System.out.println(placeTile(n,m));
    }
    static int placeTile(int n,int m){
        if(n==m){
            return 2;   // Base case: If the dimensions are equal, we can place the tile in two ways: horizontally or vertically
        }
        if(n<m){
            return 1;  // If the width is greater than the length, we can only place the tile horizontally
        }
        //place vertically
        int v= placeTile(n-m,m);
        int h= placeTile(n-1,m);
        return v+h;

    }
}
