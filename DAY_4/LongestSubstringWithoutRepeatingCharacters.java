package DAY_4;
import java.util.HashMap;
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        HashMap<Character , Integer> map = new HashMap<>();
        int maxLen = 0 , l = 0 , r = 0 ;

        while(r < len ){
            
            if(map.containsKey(s.charAt(r))){
                l = Math.max(map.get(s.charAt(r)) + 1 , l);
            }
            map.put(s.charAt(r) , r );
            maxLen = Math.max(maxLen , r - l + 1 );
            r++;
            
        }
        return maxLen;
    }
    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters obj = new LongestSubstringWithoutRepeatingCharacters();
        String s = "abcabcbb";
        int result = obj.lengthOfLongestSubstring(s);
        System.out.println("length of the longest substring is: " + result);
    }
}
