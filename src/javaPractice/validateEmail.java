package javaPractice;

public class validateEmail {
    public static boolean validateEmail(String s) {
        boolean result = false, at = false, dot = false;
        int atPos = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '@' && i > 0 && i < s.length() - 3) {
                at = true;
                atPos = i;
            }
            if (s.charAt(i) == '.' && atPos > 0 && i > atPos && i < s.length() - 1) {
                dot = true;
            }
        }
        result = at && dot;
        return result;
    }

}
