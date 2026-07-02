class Solution {
    int[][] dp;

    public int uniquePaths(int m, int n) {
        dp = new int[n][m];
        return trav(0, 0, m, n);
    }

    public int trav(int i, int j, int m, int n) {

        if (i == n - 1 && j == m - 1)
            return 1;

        if (dp[i][j] != 0)
            return dp[i][j];

        int down = 0;
        int right = 0;

        if (i + 1 < n)
            down = trav(i + 1, j, m, n);

        if (j + 1 < m)
            right = trav(i, j + 1, m, n);

        dp[i][j] = down + right;

        return dp[i][j];
    }
}