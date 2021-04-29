package javaPractice;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ArrayFilter {
    public static String[] filterArray(String[] str) {
        List<String> list = new ArrayList<String>();
        Set<String> unique = new HashSet<String>();

        for (int i = 0; i < str.length; i++) {
            String current = str[i];
            Pattern p = Pattern.compile("\\D+");
            Matcher m = p.matcher(current);

            if (!m.find() && !unique.contains(current)) {
                list.add(current);
                unique.add(current);
            }
        }
        String[] filteredArray = new String[list.size()];
        return list.toArray(filteredArray);
    }
}