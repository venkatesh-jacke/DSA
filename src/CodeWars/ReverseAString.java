package CodeWars;

public class ReverseAString {
    public static void main(String[] args) {
     fun1("venkatesh");
     fun2("venkatesh");

    }
    static void fun1(String str){
        System.out.println(new StringBuffer(str).reverse());
    }
    static void fun2(String str){
        StringBuffer sb= new StringBuffer(str);

        for(int i=0;i<str.length()/2;i++){
            char front= str.charAt(i);
            char end= str.charAt(sb.length()-1-i);
            sb.setCharAt(i,end);
            sb.setCharAt(sb.length()-1-i,front);
        }
        System.out.println(sb);
    }
}
