package leetcode.validSudoku;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[][] blocks = new HashSet[3][3];

        for(int i = 0; i < 9; i++){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                blocks[i][j] = new HashSet<>();
            }
        }

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                char currentChar = board[i][j];

                if(currentChar != '.'){

                    if(rows[i].contains(currentChar)){
                        return false;
                    }
                    rows[i].add(currentChar);

                    if(cols[j].contains(currentChar)){
                        return false;
                    }
                    cols[j].add(currentChar);

                    int blockRow = i/3;
                    int blockCol = j/3;

                    if( blocks[blockRow][blockCol].contains(currentChar)){
                        return false;
                    }
                    blocks[blockRow][blockCol].add(currentChar);

                }
            }
        }
        return true;

    }

    public static void main(String[] args) {
        char[][] board = {
                {'8', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        Solution solution = new Solution();
        solution.isValidSudoku(board);
    }
}