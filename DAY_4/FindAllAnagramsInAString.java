package DAY_4;
import java.util.ArrayList;
import java.util.HashMap;
public class FindAllAnagramsInAString {
    public ArrayList<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (s.length() < p.length()) return ans;

        HashMap<Character, Integer> pMap = new HashMap<>();
        for (char ch : p.toCharArray()) {
            pMap.put(ch, pMap.getOrDefault(ch, 0) + 1);
        }

        HashMap<Character, Integer> window = new HashMap<>();
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

    public static void main(String[] args) {
        FindAllAnagramsInAString obj = new FindAllAnagramsInAString();
        String s = "cbaebabacd";
        String p = "abc";
        ArrayList<Integer> result = obj.findAnagrams(s, p);
        System.out.println("Anagram starting indices: " + result);
    }
}
