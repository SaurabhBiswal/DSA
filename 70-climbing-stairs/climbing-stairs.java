class Solution {
    public int climbStairs(int n) {
       int[] dp=new int[n+1];
       Arrays.fill(dp,-1);
       return memoize(n,dp);
    }
    private int memoize(int n,int[] dp){
        if(n==0||n==1) return 1;
        if(dp[n]!=-1) return dp[n];
        dp[n]=memoize(n-1,dp)+memoize(n-2,dp);
        return dp[n];
    }
}