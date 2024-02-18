package Recursion;

public class AllPermutations {
    public static void main(String[] args) {
        String str="abc";
        printAllPermutations(str,"");
    }
    static void printAllPermutations(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char cur=str.charAt(i);
            String newString=str.substring(0,i)+str.substring(i+1);
            printAllPermutations(newString, ans + cur);

        }
    }
}


/*
I/0 ---> abc


O/P --->abc
        acb
        bac
        bca
        cab
        cba
 */
