package medium.atoi;

import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        System.out.println(myAtoi("    -f00089821474836489lamine56565"));
        System.out.println(myAtoi("-21474836460"));
        System.out.println(myAtoi("00000-42a1234"));
        System.out.println(myAtoi("42"));
    }

    public static int myAtoi(String s) {
        final Matcher m = Pattern
                .compile("^([+-]?\\d+)")
                .matcher(s.trim());

        String formatted = m.find() ? m.group() : "";

        if(formatted.matches("[+-]?0*"))
            return 0;

        char c = formatted.charAt(0);

        formatted = formatted
                .replaceAll("[+-]", "")
                .replaceAll("^0+", "");


        if(formatted.length() > 10)
            return c == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;

        if(Long.parseLong(formatted) >= (long) -1*Integer.MIN_VALUE)
            return c=='-'? Integer.MIN_VALUE : Integer.MAX_VALUE;
        return c=='-' ? Integer.parseInt('-'+formatted) : Integer.parseInt(formatted);
    }
}
