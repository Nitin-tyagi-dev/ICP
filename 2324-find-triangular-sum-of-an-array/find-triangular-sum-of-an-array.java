class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        
        for(int i = 1 ; i < n ; i++){
            for(int j  = 0 ; j < n - i; j++){
                int p = ( nums[j] + nums[j+1] ) % 10 ; 
               nums[j] = p;
            }
        }

        return nums[0];
    }
}