import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if (s.length() < p.length()) return ans;

        Map<Character, Integer> pMap = new HashMap<>();
        for (char ch : p.toCharArray()) {
            pMap.put(ch, pMap.getOrDefault(ch, 0) + 1);
        }

        Map<Character, Integer> window = new HashMap<>();
        int k = p.length();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            window.put(c, window.getOrDefault(c, 0) + 1);

            if (i >= k) {
                char left = s.charAt(i - k);
                if (window.get(left) == 1) {
                    window.remove(left);
                } else {
                    window.put(left, window.get(left) - 1);
                }
            }

            if (window.equals(pMap)) {
                ans.add(i - k + 1);
            }
        }

        return ans;
    }
}
