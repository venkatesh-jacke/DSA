package BitManupulation;


//Write a Program to count maximum consecutive 1's in a binary representation of an number

public class ConsecutiveOnes {
    public static void main(String[] args) {
        int n = 31;
        int count = 0;
        while (n > 0) {
            n = n & (n << 1);
            count++;
        }
        System.out.println(count);
    }
}
//Time is O(logN)

/*
Intuition

If we left shift the N by 1 than we get the consecutive ones below each other and we perform AND operation and update the N
we perform until we get Zero

If we get Zero after  N & N<<1 it means we dont have consecutive 1's

we count the no of operations here


*/
