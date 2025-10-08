package DAY_7;

public class uniquePath {
    public int uniquePaths(int m, int n) {
        return solve(0 , 0 ,m , n );
    }

    private static int solve(int row , int col , int m , int n){
        if(row == m - 1 && col == n - 1) return 1;
        if(row < 0 || row >= m || col < 0 || col >= n) return 0;

        int right = solve( row , col + 1 , m , n);
        int down = solve(row + 1 , col , m , n);

        return right + down;
    }

    public static void main(String[] args){
        uniquePath obj = new uniquePath();
        int m = 3;
        int n = 7;
        System.out.println(obj.uniquePaths(m , n));
    }
}
