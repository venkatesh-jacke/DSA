package Zoho;
public class isPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("mad 123,&*d , a12m"));
    }
    static boolean isPalindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            char leftChar=str.charAt(i);
            char rightChar=str.charAt(j);
            if(!(Character.isLetter(leftChar))){
                i++;
                continue;
            }
            if(!(Character.isLetter(rightChar))){
                j--;
                continue;
            }
            if(leftChar!=rightChar){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
