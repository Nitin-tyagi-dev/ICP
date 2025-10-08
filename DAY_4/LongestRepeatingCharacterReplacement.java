package DAY_4;

public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int len = s.length();
        int r = 0 , l = 0 , maxlen = 0 , maxfreq = 0 ;
        int[] arr = new int[26];
        while(r < len ){
            
            arr[s.charAt(r) - 'A']++;
            maxfreq = Math.max(maxfreq , arr[s.charAt(r) - 'A']);

            while((r - l + 1) - maxfreq > k){
                arr[s.charAt(l) - 'A']--;
                l++;
            }

            
            maxlen = Math.max(maxlen , r - l + 1);
            
            r++;
        }

        return maxlen ;
    }

    public static void main(String[] args) {
        LongestRepeatingCharacterReplacement obj = new LongestRepeatingCharacterReplacement();
        String s = "AABABBA";
        int k = 1;
        int result = obj.characterReplacement(s, k);
        System.out.println("The length of the longest substring after replacement is: " + result);
    }
}
