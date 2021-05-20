package javaPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

    //    static boolean isAnagram(String firstWord, String secondWord) {
//        char[] word1 = firstWord.toLowerCase().replaceAll("[\\s]", "").toCharArray();
//        char[] word2 = secondWord.toLowerCase().replaceAll("[\\s]", "").toCharArray();
//        Arrays.sort(word1);
//        Arrays.sort(word2);
//        return Arrays.equals(word1, word2);
//    }
//
//
//
//    public static void main(String[] args) {
//
//        Scanner sc=new Scanner(System.in);
//        String a=sc.next();
//        String b=sc.next();
//        boolean ret=isAnagram(a,b);
//        if(ret)System.out.println("Anagrams");
//        else System.out.println("Not Anagrams");
//    }
//}
    private static int[] frequency = new int[26];

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        for (char c : a.toCharArray()) {
            frequency[(int) c - 97]++;
        }
        for (char c : b.toCharArray()) {
            frequency[(int) c - 97]--;
        }

        return anagrams;
    }
}