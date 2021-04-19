package javaPractice;

public class charFlip {

    public static String flipEndChars(String s) {
        if(s.length() < 2)
            return "Incompatible.";

        if(s.charAt(0) == s.charAt(s.length()-1))
            return "Two's a pair.";


    }

}
