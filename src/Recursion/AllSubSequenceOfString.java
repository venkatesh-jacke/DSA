package Recursion;

public class AllSubSequenceOfString {
    public static void main(String[] args) {
        String str="abc";
        subSequences(str,0,"");
    }
    static void subSequences(String str,int i,String ans){
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        char cur=str.charAt(i);

        subSequences(str,i+1,ans+cur);
        subSequences(str,i+1,ans);
    }
}
