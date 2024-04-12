package Math;

public class BitMask {
    public static void main(String[] args) {
        int n = 36;

        switchOnIthBit(n, 3);
        switchOffIthBit(n, 5);
        toggle(36, 5);
        checkOnOrOff(36, 5);
    }

    static void switchOnIthBit(int n, int i) {
        int onMask = 1 << i;
        System.out.println(n | onMask);
    }

    static void switchOffIthBit(int n, int i) {
        int offMask = ~(1 << i);
        System.out.println(n & offMask);
    }

    static void toggle(int n, int i) {
        int tMask = (1 << i);
        System.out.println(n ^ tMask);
    }

    static void checkOnOrOff(int n, int i) {
        int mask = 1 << i;
        if ((n & mask) == 0) {
            System.out.println("OFF");
        } else {
            System.out.println("ON");
        }
    }

}

/*
Switch ON
N=36 i=3
                 i
         7 6 5 4 3 2 1 0
36 ----> 0 0 1 0 0 1 0 0
                 1
Mask ->  0 0 0 0 1 0 0 0
(OR)
44--->   0 0 1 0 1 1 0 0


Switch OFF
N=36 i=5
             i
         7 6 5 4 3 2 1 0
36 ----> 0 0 1 0 0 1 0 0
             0
Mask ->  1 1 0 1 0 0 0 0
(AND)
4--->    0 0 0 0 0 1 0 0

*/
