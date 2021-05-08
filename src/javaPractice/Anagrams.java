package javaPractice;

import java.util.Arrays;

public class Anagrams {

    static boolean isAnagram(String firstWord, String secondWord) {
        char[] word1 = firstWord.toLowerCase().replaceAll("[\\s]", "").toCharArray();
        char[] word2 = secondWord.toLowerCase().replaceAll("[\\s]", "").toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);
        return Arrays.equals(word1, word2);
    }

}