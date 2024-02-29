package Recursion;

import java.util.ArrayList;

public class PrintSubSets {
    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer> subset= new ArrayList<>();
        printSubset(n,subset);


    }
    static void printSubset(int n,ArrayList<Integer> subset){
        if(n==0){
            System.out.println(subset);
            return;
        }

        //Add the number in set
        subset.add(n);
        printSubset(n-1,subset);

        //Dont add the number so remove the added number
        subset.remove(subset.size()-1); // remove the last added number
        printSubset(n-1,subset);

    }
}
