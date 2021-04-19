package javaPractice;

public class charFlip {

    public static String flipEndChars(String s) {
        if(s.length() < 2)
            return "Incompatible.";

        if(s.charAt(0) == s.charAt(s.length()-1))
            return "Two's a pair.";

        return s.substring(s.length()-1) + s.substring(1,s.length()-1) + s.substring(0,1);
    }

}
