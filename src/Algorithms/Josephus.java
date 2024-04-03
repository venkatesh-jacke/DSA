package Algorithms;

import java.util.LinkedList;
import java.util.Queue;

public class Josephus {
    public static void main(String[] args) {
        int n = 6;
        int k = 5;
        System.out.println(rec(n, k));
        System.out.println(iterative(n, k));
        System.out.println(josephus(n, k));
        System.out.println(josephusBinary(41));
    }


    //Space is O(1)
    //Time is O(n)
    static int rec(int n, int k) {
        if (n == 1) return 1;
        return (rec(n - 1, k) + k - 1) % n + 1;

    }


    //Space is O(1)
    //Time is O(n)
    static int iterative(int n, int k) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res = (res + k) % i; //winner of each iteration
        }
        return res + 1;
    }


    //Space is O(n)
    //Time is O(n*k)
    static int josephus(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) q.add(i + 1);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < k - 1; j++) {
                q.add(q.poll());
            }
            q.poll();
        }
        return q.poll();
    }

    static int josephusBinary(int n) {
        int doubledValue = n * 2;
        System.out.println("doubled value " + doubledValue);
        int highestOneBit = Integer.highestOneBit(doubledValue);
        System.out.println("highestOneBit value " + highestOneBit);
        int negatedHighestOneBit = ~highestOneBit;
        System.out.println("negatedHighestOneBit value " + negatedHighestOneBit);
        int doubledN = n << 1;
        System.out.println("doubledN value " + doubledN);
        int withLeastSignificantBit = doubledN | 1;
        System.out.println("withLeastSignificantBit value " + withLeastSignificantBit);
        int result = negatedHighestOneBit & withLeastSignificantBit;
        return result;
        //return ~Integer.highestOneBit(n*2) & ((n<<1) | 1);
    }

}


/*
josephusBinary(41)

2^a + l
2l+1
41---> 101001
       010011  -----> 19
 Here = 2^5 + 9
 2l+1 ---> 2(9)+1 = 19


Resource
https://cp-algorithms.com/others/josephus_problem.html

*/
