class Solution {
    public int cherryPickup(int[][] grid) {
        int r = grid.length, c = grid[0].length;
		// dp[i][m][n] means in row i, robot1 is at colomn m, robot2 is at colomn n, the max value
        int[][][] dp = new int[r][c][c];
        dp[0][0][c-1] = grid[0][0] + grid[0][c-1];
        for(int i = 1; i<r; i++)
        {
            for(int m = 0; m<=Math.min(i, c-1); m++)
            {                
                for(int n = c-1; n>= Math.max(c-i-1,0); n--)
                {                                    
                    int t1 = check(m-1, n-1, c)? dp[i-1][m-1][n-1]:0;
                    int t2 = check(m-1, n, c)? dp[i-1][m-1][n]:0;
                    int t3 = check(m-1, n+1, c)? dp[i-1][m-1][n+1]:0;
                    int t4 = check(m, n-1, c)? dp[i-1][m][n-1]:0;
                    int t5 = check(m, n, c)? dp[i-1][m][n]:0;
                    int t6 = check(m, n+1, c)? dp[i-1][m][n+1]:0;
                    int t7 = check(m+1,n-1,c) ? dp[i-1][m+1][n-1]:0;
                    int t8 = check(m+1,n, c) ? dp[i-1][m+1][n]:0;
                    int t9 = check(m+1,n+1,c)? dp[i-1][m+1][n+1]:0;
                    
                    int max = Math.max(t1, Math.max(t2, Math.max(t3, Math.max(t4, Math.max(t5, Math.max(t6, Math.max(t7, Math.max(t8, t9))))))));
                    dp[i][m][n] = (m == n? grid[i][m] : grid[i][m]+grid[i][n]) + max;
                }
            }
            
        }
        int res = 0;
        for(int i = 0; i<c; i++)
        {
            for(int j = 0; j<c; j++)
            {
                res = Math.max(res, dp[r-1][i][j]);
            }
        }
        return res;
    }
    private boolean check(int i, int j, int c)
    {
        return i>=0&&i<c && j>=0&&j<c;
    }
}