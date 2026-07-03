class Solution {
     private int func1(int n, int dp[]){
        if(n==0 ||n==1)return 1;
       if(dp[n]!=-1)return dp[n];
       dp[n]=func1(n-1,dp)+func1(n-2,dp);
       return dp[n];
    }
    private int fun(int pos ,int n){
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return func1(n,dp);
       
    }
   
    public int climbStairs(int n) {
        return fun(0,n);
    }
}