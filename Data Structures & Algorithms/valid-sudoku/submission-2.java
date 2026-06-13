class Solution {
    public boolean isValidSudoku(char[][] board) {
        return checkRowsAndCols(board) && checkBoxes(board);
    }

    public static boolean checkRowsAndCols(char[][] board){
        for (int i = 0; i < board.length; i++){
            HashSet<Character> rowSeen = new HashSet<>();
            HashSet<Character> colSeen= new HashSet<>();
            for (int j = 0; j < board[i].length; j++){
                if (board[i][j] != '.'){
                    if (rowSeen.contains(board[i][j])){
                        return false;
                    }
                    rowSeen.add(board[i][j]);
                }
                if (board[j][i] != '.'){
                    if (colSeen.contains(board[j][i])){
                        return false;
                    }
                    colSeen.add(board[j][i]);
                }
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
