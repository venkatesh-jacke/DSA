package Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        toh(2, 'S', 'H', 'D');
    }

    //Time Complexity is O(2^n-1)
    public static void toh(int n, char source,char auxillary, char destination){
        if(n>0){
            toh(n-1,source,destination,auxillary);
            System.out.println("disk "+n+" from "+source +" to " +destination);
            toh(n-1,auxillary,source,destination);
        }
    }
}
