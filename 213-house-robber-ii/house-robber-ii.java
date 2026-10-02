class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        if(n==1) return nums[0];

        int[] dp1=new int[n];
        int[] dp2=new int[n];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        return Math.max(solve(n-1,1,nums,dp1),solve(n-2,0,nums,dp2));
    }
    private int solve(int i,int start,int[] nums,int[] dp){
        if(i==start) return nums[start];
        if(i<start) return 0;
        if(dp[i]!=-1) return dp[i];
        int pick = nums[i]+solve(i-2,start,nums,dp);
        int notpick=solve(i-1,start,nums,dp);
        return dp[i]=Math.max(pick,notpick);
    }
}