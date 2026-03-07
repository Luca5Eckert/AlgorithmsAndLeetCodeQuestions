package leetcode.surroundedRegions;


class Solution {
    public void solve(char[][] board) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                char value = board[i][j];

                if (value == 'X') {
                    continue;
                }

                if (isAround(board, i, j)) {
                    board[i][j] = 'X';
                }

            }
        }

    }

    public boolean isAround(char[][] board, int X, int y) {
        return haveInX(board, X, y, -1) &&
                haveInX(board, X, y, 1) &&
                haveInY(board, X, y, -1) &&
                haveInY(board, X, y, 1);

    }

    private boolean haveInX(char[][] board, int x, int y, int move) {
        int colls = board.length;
        int rows = board[0].length;
        int newX = x + move;

        if (newX < 0 || y < 0 || newX >= colls || y >= rows) return false;

        char value = board[newX][y];

        if (value == 'X') return true;

        return haveInX(board, newX, y, move);

    }

    private boolean haveInY(char[][] board, int x, int y, int move) {
        int colls = board.length;
        int rows = board[0].length;
        int newY = y + move;

        if (x < 0 || newY < 0 || x >= colls || newY >= rows) return false;

        char value = board[x][newY];

        if (value == 'X') return true;

        return haveInX(board, x, newY, move);
    }


    public static void main(String[] args) {
        char[][] board = {
                {'O', 'X', 'X', 'O', 'X'},
                {'X', 'O', 'O', 'X', 'O'},
                {'X', 'O', 'X', 'O', 'X'},
                {'O', 'X', 'O', 'O', 'O'},
                {'X', 'X', 'O', 'X', 'O'}
        };

        Solution solution = new Solution();

        solution.solve(board);
    }

}