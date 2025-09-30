class Solution {
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
}