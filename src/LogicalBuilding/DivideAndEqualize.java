package LogicalBuilding;

import java.util.HashMap;
import java.util.Scanner;

//https://codeforces.com/problemset/problem/1881/D
public class DivideAndEqualize {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            System.out.println(divideAndEqualize(n,arr));
        }
    }

    static String divideAndEqualize(int n, int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i : arr) {
            getPrimeFactors(i,map);
        }
        System.out.println(map);
        for(int i:map.values()){
            if(i%n!=0) return "No";
        }
        return "Yes";
    }

    static void getPrimeFactors(int n,HashMap<Integer,Integer> map) {
        int i = 2;
        while (i * i <= n) {
            while (n % i == 0) {
                map.put(i, map.getOrDefault(i, 0) + 1);
                n /= i;
            }
            i++;
        }
        if (n > 1) map.put(n, map.getOrDefault(n, 0) + 1);
    }
}

/*
Intuition

Count the no of prime factors if they are all equal to n than its possible

Dry Run
N=5
arr=100 2 50 10 1


Original
100 2 50 10 1
2   2 2  2
2     5  5
5     5
5


no of 2's ---> 5  % 5 == 0
no of 5's ---> 5 % 5 == 0

All prime factors can be equally shared to all elements in the array

After Operations
10 10 10 10 10
2  2  2  2  2
5  5  5  5  5




dgfhfgsjdfhg*/
