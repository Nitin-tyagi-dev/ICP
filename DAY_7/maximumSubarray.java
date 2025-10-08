package DAY_7;

class maximumSubarray {

     public  static int maxSubArray(int[] nums) {

        int len = nums.length;
        int sum = 0 ;
        int max_sum = Integer.MIN_VALUE;

        for(int i = 0 ; i < len ; i++){

            sum += nums[i];

            if( sum > max_sum ){
                max_sum = sum;
            }

            if(sum < 0 ){
                sum = 0 ;
            }
        }
        return max_sum ; 
    }

    public static void main(String[] args){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println( maxSubArray(nums));
    }
}