package Recursion;

public class Palindrome {
    public static void main(String[] args) {
        String str="racecar";
        System.out.println(palindrome(str));
    }
    static boolean palindrome(String str){
        if(str.length()<=1) return true;
        if(str.charAt(0)!=str.charAt(str.length()-1))
            return false;
        return palindrome(str.substring(1,str.length()-1));
    }
}
