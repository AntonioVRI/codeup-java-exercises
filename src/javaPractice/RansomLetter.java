package javaPractice;

public class RansomLetter {
    public static boolean canBuild(String str1, String str2) {
        char str1_new[]=str1.toCharArray();
        char str2_new[]=str2.toCharArray();
        boolean flag=false;
        int k=1;
        if(str2_new.length==0)
            return true;
        for (int j = 0; j < str2_new.length; j++) {
        }