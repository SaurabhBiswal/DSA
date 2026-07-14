class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n,cost,dp);
    }
    private int solve(int i,int[] cost,int[] dp){
        if(i==0||i==1) return 0;
        if(dp[i]!=-1) return dp[i];
        int jumpone=solve(i-1,cost,dp)+cost[i-1];
        int jumptwo=solve(i-2,cost,dp)+cost[i-2];
        dp[i]= Math.min(jumpone,jumptwo);
        return dp[i];
    }
}