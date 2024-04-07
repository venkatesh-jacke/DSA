package Math;

public class Gcd {
    public static void main(String[] args) {
        System.out.println(eculidan(11173, 11133));
        System.out.println(gabriel(11173, 11133));
    }

    static int eculidan(int a, int b) {
        int c = 0;
        while (a != b) {
            if (a > b) a = a - b;
            else b = b - a;
            c++;
        }
        System.out.println("count for Euclidean " + c);
        return a;

    }


    //O(logN)
    static int gabriel(int a, int b) {
        int c = 0;
        while (a != 0 && b != 0) {
            if (a > b) a = a % b;
            else b = b % a;
            c++;
        }
        System.out.println("count for gabriel " + c);
        if (b == 0) return a;
        else return b;
    }
}
/*
Euclidean Algorithm
1.Find Larger element
2. Make largest element to diff between larger and smaller
3.repeat until a==b
4.return a or b

Gabriel Lame
1.Find Larger element
2. Make largest element to modulo of larger element to smallest element
3.repeat until anyone element becomes 0
4.return the other element.
*/
