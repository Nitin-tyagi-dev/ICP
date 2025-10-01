class Solution {
    public int lengthOfLastWord(String s) {
        String s1 = s.strip();
        int len = s1.length();
        int count = 0 ;
        for(int i = len - 1 ; i >= 0 ; i--){
            if(s1.charAt(i) == ' ') break;
            count++;
        }

        return count;
    }
}