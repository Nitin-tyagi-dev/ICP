class Solution {
    public String mergeAlternately(String word1, String word2) {
        int start = 0 ;
        
        StringBuilder sb = new StringBuilder();
        while(start < word1.length() && start < word2.length()){
            sb.append(word1.charAt(start));
            sb.append(word2.charAt(start));
            start++;
            

        }

        while(start < word1.length()){
            sb.append(word1.charAt(start));
            start++;
        }
        while(start < word2.length()){
            sb.append(word2.charAt(start));
            start++;
        }

        return sb.toString();
    }
}