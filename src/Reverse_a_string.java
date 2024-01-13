public class Reverse_a_string {
    public static void main(String[] args) {
        Reverse_a_string rs = new Reverse_a_string();
        char[] str = {'a', 'b', 'c'}; // Define the character array
        rs.reverseString(str, 0);
    }

    void reverseString(char[] str, int index) {
        if (index >= str.length) return;
        reverseString(str, index + 1);
        System.out.print(str[index]);
    }

}
