package neetcode.medium;

import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashSet<Character> set = new HashSet<>();

        // check rows
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] != '.') {

                    if (set.contains(board[i][j]))
                        return false;

                    set.add(board[i][j]);
                }
            }

            set.clear();
        }

        // check columns
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (board[j][i] != '.') {

                    if (set.contains(board[j][i]))
                        return false;

                    set.add(board[j][i]);
                }
            }

            set.clear();
        }

        // check 3x3 sub-boxes
        for (int boxRow = 0; boxRow < 9; boxRow += 3) {
            for (int boxCol = 0; boxCol < 9; boxCol += 3) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char ch = board[boxRow + i][boxCol + j];
                        if (ch != '.') {
                            if (set.contains(ch))
                                return false;
                            set.add(ch);
                        }
                    }
                }
                set.clear();
            }
        }

        return true;
    }
}