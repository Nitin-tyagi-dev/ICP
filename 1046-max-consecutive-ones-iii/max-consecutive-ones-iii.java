class Solution {
    public int longestOnes(int[] nums, int k) {
        int len = nums.length;
        int l = 0 , r = 0 , maxlen = 0 , zero = 0 ;

        while( r < len){
            if(nums[r] == 0 ){
                zero++;
            }

            if(zero > k){
                if(nums[l] == 0){
                    zero--;
                }
                l++;
            }

            if(zero <= k){
                maxlen = Math.max(maxlen , r - l + 1 );
            }

            r++;
        }

        return maxlen;
        
    }
}
