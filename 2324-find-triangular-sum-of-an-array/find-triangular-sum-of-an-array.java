class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0 ; i < n ; i++){
            list.add(new ArrayList<>());
        }


        for(int i = 0 ; i < n ; i++){
            list.get(0).add(nums[i]);
        }

        for(int i = 1 ; i < n ; i++){
            for(int j  = 0 ; j < list.get(i-1).size() - 1 ; j++){
                int p = (list.get(i-1).get(j) + list.get(i-1).get(j + 1)) % 10 ; 
                list.get(i).add(p);
            }
        }

        return list.get(n-1).get(0);
    }
}