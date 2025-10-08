package DAY_4;

class MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int r = 0 , l = 0 , max = 0 , zero = 0 ;

        while(r < n){
            if(nums[r] == 0){
                zero++;
            }

            while(zero > k ){
                if(nums[l] == 0){
                    zero--;
                }
                l++;
            }

            max = Math.max(max , r - l + 1);
            r++;
        }

        return max;
    }
    
    public static void main(String[] args) {
        MaxConsecutiveOnesIII obj = new MaxConsecutiveOnesIII();
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(obj.longestOnes(nums, k)); // Output: 6
    }
    
}