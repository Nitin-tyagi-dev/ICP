class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;

        for(int i = 0 ; i < m ; i++){
            int start = 0 , end = n - 1  ;

            while(start <= end ){
                int mid  = (start + end ) / 2 ;

                if(matrix[i][mid] == target){
                    return true ;
                }
                else if(matrix[i][mid] > target){
                    end = mid - 1 ;
                }
                else{
                    start = mid + 1 ; 
                }

            }
        }

        return false ;
        
    }
}