import java.util.Arrays;
class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==0) return nums[0];
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return maxamountrob(n-1,nums,dp);
    }
    private int maxamountrob(int n,int[] nums,int[] dp){
        if(n==0) return nums[0];
        if(n==1) return Math.max(nums[0],nums[1]);
        if(dp[n]!=-1) return dp[n];
        return dp[n]=Math.max(maxamountrob(n-2,nums,dp)+nums[n],maxamountrob(n-1,nums,dp));
    }
}