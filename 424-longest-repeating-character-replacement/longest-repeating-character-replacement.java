class Solution {
    public int characterReplacement(String s, int k) {
        int len = s.length();
        int r = 0 , l = 0 , maxlen = 0 , maxfreq = 0 ;
        int[] arr = new int[26];
        while(r < len ){
            
            arr[s.charAt(r) - 'A']++;
            maxfreq = Math.max(maxfreq , arr[s.charAt(r) - 'A']);

            if((r - l + 1) - maxfreq > k){
                arr[s.charAt(l) - 'A']--;
                l++;
            }

            if((r - l + 1) - maxfreq <= k ){
                maxlen = Math.max(maxlen , r - l + 1);
            }
            r++;
        }

        return maxlen ;


        
    }
}
