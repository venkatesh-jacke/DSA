package Recursion;

public class ReverseString {
    public static void main(String[] args) {
        String str="Hello World!";
        //String str="venkat";
        reverseString(str,0);
        System.out.println();
        reverseString2(str,str.length()-1);
    }
    static void reverseString(String str,int n){
        if(n==str.length()) return;
        reverseString(str,n+1);
        System.out.print(str.charAt(n));

    }

    static void reverseString2(String str,int n){
        if(n<0) return;
        System.out.print(str.charAt(n));
        reverseString2(str,n-1);

    }
}
