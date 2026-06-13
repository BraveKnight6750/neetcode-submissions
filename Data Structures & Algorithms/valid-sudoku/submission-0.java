class Solution {
    public boolean isValidSudoku(char[][] board) {
        return checkColumns(board) && checkRows(board) && checkBoxes(board);
    }

    public static boolean checkRows(char[][] board){
        for (int i = 0; i < board.length; i++){
            HashSet<Character> seen = new HashSet<>();
            for (int j = 0; j < board[i].length; j++){
                if (board[i][j] == '.') continue;
                if (!seen.contains(board[i][j])){
                    seen.add(board[i][j]);
                    continue;
                }
                return false;
            }
        }
        return true;
    }

    public static boolean checkColumns(char[][] board){
        for (int i = 0; i < board[0].length; i++){
            HashSet<Character> seen = new HashSet<>();
            for (int j = 0; j < board.length; j++){
                if (board[j][i] == '.') continue;
                if (!seen.contains(board[j][i])){
                    seen.add(board[j][i]);
                    continue;
                }
                return false;
            }
        }
        return true;
    }

    public static boolean checkBoxes(char[][] board){
        for (int i =0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                HashSet<Character> seen = new HashSet<>();
                for (int r = 3 * i; r < (3 * i) + 3; r++){
                    for (int c = 3 * j; c < (3 * j) + 3; c++){
                        if (board[r][c] == '.') continue;
                        if (!seen.contains(board[r][c])){
                            seen.add(board[r][c]);
                            continue;
                        }
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
