package Recursion;

import java.util.HashSet;

public class AllUniqueSubsequence {
    public static void main(String[] args) {
        String str="aaa";
        allSubSequence(str,0,"",new HashSet<String>());
    }
    static void allSubSequence(String str, int i, String ans,HashSet<String> res){
        if(i==str.length()){
            if (!res.contains(ans)) {
                System.out.println(ans);
                res.add(ans);
            }
            return ;
        }
        char cur=str.charAt(i);
        allSubSequence(str,i+1,ans+cur,res);
        allSubSequence(str,i+1,ans,res);
    }
}
/*
I/0 ---> abc


O/P --->aaa
        aa
        a
 */