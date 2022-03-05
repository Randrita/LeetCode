class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                board[i][j] = '.';
            }
        }
        helper(n, 0, new int[n], board, res);
        return res;
    }
    
    private void helper(int n, int index, int[] occupied, char[][] board, List<List<String>> res) {
        if (index == n) {
            List<String> path = new ArrayList<>();
            for (int i=0; i<n; i++) {
                path.add(String.valueOf(board[i]));
            }
            res.add(path);
            return;
        }
        // iterate through the columns
        for (int i=0; i<n; i++) {
            // check if the current column collides with columns from previous rows and check if the diagnol already has queuen.
            if (isValid(occupied, index, i)) {
                // place the queen at row index column i
                occupied[index] = i;
                // if not under attach, then create the path of having the queen at row index and column i.
                board[index][i] = 'Q';
                helper(n, index+1, occupied, board, res);
                board[index][i] = '.';
            }
        }
    }
    
    private boolean isValid(int[] occupied, int prevRows, int colIndex) {
        for (int i=0; i<prevRows; i++) {
            // if the current column is occupied by previous rows, or there are queens in previous rows on the same diagnol. For the second case, if they are on the same diagnol, the distance of current row to previous row will be the same as the distance from the current column to the previous column.
            if (occupied[i] == colIndex || Math.abs(colIndex - occupied[i]) == Math.abs(i - prevRows)) {
                return false;
            }
        }
        return true;
    }
}