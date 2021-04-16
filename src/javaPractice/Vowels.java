package javaPractice;

public class Vowels {
    public static int getCount(String str) {
        int vowelCount = 0;

        str.toLowerCase();

        for (int i=0; i<str.length();i++)
        {
            switch(str.charAt(i))
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':

                vowelCount++;
                break;
            }
        }
        return vowelCount;
    }
}