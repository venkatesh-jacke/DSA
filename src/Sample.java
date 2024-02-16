public class Sample {

    public static void main(String[] args) {
       String str="abbccda";
        fun(str,0, new char[26],"");


    }

    static void  fun(String str, int i, char[] arr,String ans) {
        char cur= str.charAt(i);
        if(i==str.length()-1){
            System.out.println(ans);
            return;
        }
        if(arr[cur-'a']==0){
            arr[cur-'a']++;
            ans=ans+cur;
        }
            fun(str, i + 1, arr, ans);
    }
}