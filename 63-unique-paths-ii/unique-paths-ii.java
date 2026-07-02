class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
     int n=obstacleGrid.length,m=obstacleGrid[0].length;
     if(obstacleGrid[0][0]==1 || obstacleGrid[n-1][m-1]==1)return 0;
     int dp[][]=new int[n][m];
     return  back(0,0,n,m,obstacleGrid,dp);
     
    }
    int back(int i,int j,int n,int m,int[][] obstacleGrid,int[][] dp){
            if(i==n-1 && j==m-1)return 1;
            int cnt=0;
            if(dp[i][j]!=0)return dp[i][j];

            if(i<n-1 && obstacleGrid[i+1][j]!=1){
               cnt+=back(i+1,j,n,m,obstacleGrid,dp);
            }
            if(j<m-1 && obstacleGrid[i][j+1]!=1){
                cnt+=back(i,j+1,n,m,obstacleGrid,dp);
            }
            dp[i][j]=cnt;
            return cnt;
    }
}