package DAY_2;

public class validPerfectSquare {
    public boolean isPerfectSquare(int num) {
        if (num < 2) return true;
        
        long left = 2, right = num / 2;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long sq = mid * mid;
            
            if (sq == num) return true;
            else if (sq < num) left = mid + 1;
            else right = mid - 1;
        }
        
        return false;
        
    }

    public static void main(String[] args) {
        validPerfectSquare obj = new validPerfectSquare();
        int num = 16;
        boolean result = obj.isPerfectSquare(num);
        System.out.println("Is " + num + " a perfect square? " + result);
    }
}
