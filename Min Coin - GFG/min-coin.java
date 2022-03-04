// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String S = br.readLine().trim();
            String[] S1 = S.split(" ");
            int n = Integer.parseInt(S1[0]);
            int amount  = Integer.parseInt(S1[1]);
            String s = br.readLine().trim();
            String[] s1 = s.split(" ");
            int[] nums = new int[n];
            for(int i = 0; i < s1.length; i++)
                nums[i] = Integer.parseInt(s1[i]);
            Solution ob = new Solution();
            int ans = ob.MinCoin(nums, amount);
            System.out.println(ans);           
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int MinCoin(int[] nums, int amount)
    {
        // Code here
        int n=nums.length;
        int[][] dp=new int[n+1][amount+1];
        for(int i=0;i<amount+1;i++) dp[0][i]=Integer.MAX_VALUE-1;
        for(int i=0;i<n+1;i++) dp[i][0]=0;
        for(int i=1;i<n+1;i++){
            for(int j=1;j<amount+1;j++){
                if(nums[i-1]<=j) dp[i][j]=Math.min(dp[i][j-nums[i-1]]+1,dp[i-1][j]);
                else dp[i][j]=dp[i-1][j];
            }
        }
        if(dp[n][amount]==Integer.MAX_VALUE-1) return -1;
        return dp[n][amount];
    }
}