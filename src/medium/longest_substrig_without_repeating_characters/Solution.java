package medium.longest_substrig_without_repeating_characters;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        List<String> strings = List.of(
                "abcabcbb",
                "bbbbb",
                "pwwkew",
                " ",
                "dvdf",
                "abba",
                "tmmzuxt",
                "jcwsdgbcikvudbciukw",
                "cbsdjkcbdsjkcbcjkbdkcsdbkcjdclw<ucv dscvilfsdfgcsduiçcfgsduqicvwsdgipouvc f");

        strings
            .stream()
            .map(Solution::lengthOfLongestSubstring)
            .forEach(System.out::println);
    }

    private static int lengthOfLongestSubstring(String s) {
        int max = 0, count = 0;
        Character c;
        Map<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (!hm.containsKey(c)) {
                hm.put(c, i);
                count++;
                continue;
            }

            max = Math.max(max, count++);
            count = Math.min(count, i - hm.get(c));
            hm.put(c, i);
        }

        return Math.max(max, count);
    }

}
