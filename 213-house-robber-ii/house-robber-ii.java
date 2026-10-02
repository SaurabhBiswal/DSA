class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);
        return Math.max(solvetab(nums,0,n-2),solvetab(nums,1,n-1));
    }
    private int solvetab(int[] nums,int start,int end){
        int length=end-start+1;
        int[] dp=new int[length];
        dp[0]=nums[start];
        dp[1]=Math.max(nums[start],nums[start+1]);
        for(int i=2;i<length;i++){
            int pick=nums[start+i]+dp[i-2];
            int notpick=dp[i-1];
            dp[i]=Math.max(pick,notpick);
        }
        return dp[length-1];
    }
}