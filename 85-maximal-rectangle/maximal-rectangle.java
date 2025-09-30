class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n  = matrix.length;
        int m = matrix[0].length;
        int ans = 0 ;
        for(int i = 0 ; i < n ; i++){
            int r[] = new int[m];
            for(int j = i ; j < n ; j++){
                for(int k = 0 ; k < m ;k++){
                    if(matrix[j][k] == '1') r[k] += 1;  
                    else r[k] = 0; 
                }

                int h = j - i + 1;
                int sum = 0 ;
                for(int k = 0 ; k < m ; k++){
                    if(r[k] == h){
                        sum += h;
                        ans = Math.max(ans , sum);
                    }
                    else{
                        sum = 0 ;
                    }
                }
            }
        }

        return ans;
    }
}