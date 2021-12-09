class Solution {
    public int maximumWealth(int[][] accounts) { 
        //assigning a min value
        int ans=Integer.MIN_VALUE;
        
        //create a variable and store the sum in that variable then    compare it with the min value
        for(int i=0;i<accounts.length;i++)
         {
            int temp=0;
            
            for(int j=0;j<accounts[i].length;j++)
            {
                temp=temp+accounts[i][j];
            }
            
            if(temp>ans)
            {
                ans=temp;
            }
        
        }
            
        return ans;
    }
}