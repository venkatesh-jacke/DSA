package CodeWars;

public class ToCamelCase {
    public static void main(String[] args) {
        // Example usage of the toCamelCase method
        System.out.println(toCamelCase("this_is_a_sample_string"));
    }

    static String toCamelCase(String str) {
        // Initialize a StringBuilder to build the camelCase string
        StringBuilder stringBuilder = new StringBuilder();

        // Initialize a flag to determine whether the next character should be capitalized
        boolean capitalizeNext = false;

        // Iterate through each character in the input string
        for (char c : str.toCharArray()) {
            // Check if the character is a letter or digit
            if (Character.isLetter(c) || Character.isDigit(c)) {
                // If capitalizeNext is true, append the uppercase version of the character
                // and reset capitalizeNext to false
                if (capitalizeNext) {
                    stringBuilder.append(Character.toUpperCase(c));
                    capitalizeNext = false;
                } else {
                    // If capitalizeNext is false, append the lowercase version of the character
                    stringBuilder.append(Character.toLowerCase(c));
                }
            } else {
                // If the character is not a letter or digit, set capitalizeNext to true
                // to indicate that the next character should be capitalized
                capitalizeNext = true;
            }
        }

        // Return the resulting camelCase string
        return stringBuilder.toString();
    }
}
