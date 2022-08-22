package mediaum.longest_substrig_without_repeating_characters;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring(" "));
        System.out.println(lengthOfLongestSubstring("dvdf"));
        System.out.println(lengthOfLongestSubstring("abba"));
        System.out.println(lengthOfLongestSubstring("tmmzuxt"));
    }

    private static int lengthOfLongestSubstring(String s) {
        int max = 0, count = 0;
        Character c;
        Map<Character, Integer> hm = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            c = s.charAt(i);
            if(!hm.containsKey(c)){
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
