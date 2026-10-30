public class WordSearch {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (backtrack(board, word, i, j, 0)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public boolean backtrack(char[][] board, String word,
                             int x, int y, int index) {
        if (index == word.length()) {
            return true;
        }

        if (x < 0 || x >= board.length ||
                y < 0 || y >= board[0].length ||
                board[x][y] != word.charAt(index)) {
            return false;
        }

        char original = board[x][y];
        board[x][y] = '#';

        boolean found =
                backtrack(board, word, x, y + 1, index + 1) ||
                        backtrack(board, word, x, y - 1, index + 1) ||
                        backtrack(board, word, x - 1, y, index + 1) ||
                        backtrack(board, word, x + 1, y, index + 1);

        board[x][y] = original;

        return found;
    }
}
