package DAY_4;

import java.util.HashMap;
import java.util.Map;

public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        Map<Character, Integer> s1Map = new HashMap<>();
        for (char c : s1.toCharArray()) {
            s1Map.put(c, s1Map.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> window = new HashMap<>();
        int k = s1.length();

        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            window.put(c, window.getOrDefault(c, 0) + 1);

            if (i >= k) {
                char left = s2.charAt(i - k);
                if (window.get(left) == 1) {
                    window.remove(left);
                } else {
                    window.put(left, window.get(left) - 1);
                }
            }

            if (window.equals(s1Map)) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        PermutationInString obj = new PermutationInString();
        String s1 = "ab", s2 = "eidbaooo";
        System.out.println(obj.checkInclusion(s1, s2));
    }
}
