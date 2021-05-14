package javaPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String firstWord, String secondWord) {
        if (s1.length() != s2.length()) {
            return false;
        }

        char[] a = s1.toLowerCase().toCharArray();
        char[] b = s2.toLowerCase().toCharArray();
        boolean anagram = true;
        Arrays.sort(a);
        Arrays.sort(b);

        for(int i = 0; i < a.length; i++) {
            if(a[i] != b[i]) {
                anagram = false;
            }
        }

        return anagram;
    }



    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        boolean ret=isAnagram(a,b);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
    }
}
