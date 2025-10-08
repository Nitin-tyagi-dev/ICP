package DAY_3;

public class NumberOfIsland {
    public int numIslands(char[][] grid) {
        int count = 0 ; 
        int n = grid.length;
        int m = grid[0].length;

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(grid[i][j] == '1'){
                    count++;
                    helper(grid , i , j);
                }
            }
        }

        return count;
    }

    public static void helper(char[][] grid , int i , int j){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0') return ;
        grid[i][j] = '0';

        helper(grid , i + 1 , j);
        helper(grid , i , j + 1);
        helper(grid , i - 1 , j );
        helper(grid , i , j - 1);
    }

    public static void main(String[] args) {
        char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };

        NumberOfIsland obj = new NumberOfIsland();
        int result = obj.numIslands(grid);
        System.out.println("Number of Islands: " + result); // Output: 3
    }
}
