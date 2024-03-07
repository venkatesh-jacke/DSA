package CodeWars;

public class FindMissingLetter {
    public static void main(String[] args) {
        char[] chars=new char[] { 'a','b','c','d','f' };
        System.out.println(findMissingLetter(chars));
    }
    public static char findMissingLetter(char[] arr)
    {

        for(int i=0;i<arr.length;i++){
            if(arr[i+1]-arr[i]!=1){
                return ++arr[i];
            }
        }
        return ' ';
    }
}
