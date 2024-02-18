package Recursion;

public class PathsInMaze {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        int i = 2;
        int j = 1;
        System.out.println(printPaths(n, m, i, j));
    }

    static int printPaths(int n, int m, int i, int j) {
        if(i==n||j==m){
            return 0;  //boundary
        }
        if (i == n - 1 && j == m - 1) {
            return 1;  //final destination
        }

        //move downwards
        int down = printPaths(n, m, i + 1, j);
        //move right
        int right = printPaths(n, m, i, j + 1);

        return down+right;

    }
}
/*
I/0 ---> n=3,m=3  i=0,j=0


O/P ---> 6
|-------|-------|-------|
| (0,0) | (0,1) | (0,2) |
|-------|-------|-------|
| (1,0) | (1,1) | (1,2) |
|-------|-------|-------|
| (2,0) | (2,1) | (2,2) |
|-------|-------|-------|
 */