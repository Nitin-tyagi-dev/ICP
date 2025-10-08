package DAY_3;

public class SearchA2dMatrix {
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

    public static void main(String[] args) {
        SearchA2dMatrix obj = new SearchA2dMatrix();
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        int target = 3;
        boolean result = obj.searchMatrix(matrix, target);
        System.out.println("Target " + target + " found: " + result);
    }
}
