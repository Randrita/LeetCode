import java.util.*;

class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int[] dp= new int[nums.length];
        Arrays.fill(dp,-1);
        int i=nums.length-2;
        int j=nums.length-1;
        int a=f(nums,dp,i);
        int b=k(nums,dp,j);
        
        return Math.max(a,b);
    }
    
    static int f(int[] nums,int[] dp,int i){
        if(i==0){return nums[i];}
        if(i<0){return 0;}
        
        if(dp[i]!=-1){return dp[i];}
        int pick=nums[i]+f(nums,dp,i-2);
        int notPick=0+f(nums,dp,i-1);
        return dp[i]=Math.max(pick,notPick);
    }
    
        static int k(int[] nums,int[] dp,int i){
        if(i==0){return 0;}
        if(i<0){return 0;}
        
        if(dp[i]!=-1){return dp[i];}
        int pick=nums[i]+f(nums,dp,i-2);
        int notPick=0+f(nums,dp,i-1);
        return dp[i]=Math.max(pick,notPick);
    }
}