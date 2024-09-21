

import javafx.util.Pair;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        List<String> dictionary = Arrays.asList("a", "b", "c");
        String sentence = "aadsfasf absbs bbab cadsfafs";
//        List<String> dictionary = Arrays.asList("cat", "bat", "rat");
//        String sentence = "the cattle was rattled by the battery";
        System.out.println(replaceWords(dictionary, sentence));
    }

    static public String replaceWords(List<String> dictionary, String sentence) {
        String[] sentenceArray = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : sentenceArray) {
            String replacement = word;

            for (String prefix : dictionary) {
                if (replacement.startsWith(prefix) && replacement.length() > prefix.length()) {
                    replacement = prefix;
                }
            }
            sb.append(replacement).append(" ");


        }

        return sb.toString();
    }


}


