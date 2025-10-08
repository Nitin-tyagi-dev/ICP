public class wordSearch {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (backtrack(board, word, r, c, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean backtrack(char[][] board, String word, int r, int c, int index) {
        if (index == word.length()) {
            return true;
        }

        
        if (r < 0 || r >= board.length || c < 0 || c >= board[0].length || board[r][c] != word.charAt(index)) {
            return false;
        }

        char temp = board[r][c]; 
        board[r][c] = '#';
        
        boolean found = backtrack(board, word, r + 1, c, index + 1) ||
                        backtrack(board, word, r - 1, c, index + 1) ||
                        backtrack(board, word, r, c + 1, index + 1) ||
                        backtrack(board, word, r, c - 1, index + 1);

        board[r][c] = temp;
        return found;
    }

    public static void main(String[] args) {
        char[][] board = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };
        String word = "ABCCED";

        wordSearch solution = new wordSearch();
        boolean result = solution.exist(board, word);
        System.out.println("Word exists in the board: " + result);
    }
}