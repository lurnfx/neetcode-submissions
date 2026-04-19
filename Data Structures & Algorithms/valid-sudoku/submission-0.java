class Solution {
    public boolean isValidSudoku(char[][] board) {
        //here check the duplicate string massges which are created for the row + column and 3*3 matrix 
        Set seen = new HashSet<>();

        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                char number = board[i][j];  // [0,0]  [1]
                if (number != '.') {
                    if (!seen.add(number + "in row" + i) || !seen.add(number + "in column" + j)    //3 sentence its created 
                        || !seen.add(number + "in column" + i / 3 + "-" + j / 3)) {
                        return false;
                    }
                }
               
            }
        }
         return true;
    }
}
