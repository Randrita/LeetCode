// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            ArrayList<Long> arr = new ArrayList<Long>();
            for(int i = 0;i<n;i++)
                {
                    long x = sc.nextInt();
                    arr.add(x);
                }
            long m = sc.nextLong();
            
            Solution ob = new Solution();
            
    		System.out.println(ob.findMinDiff(arr,n,m));
        }
        
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
   public long findMinDiff (ArrayList<Long> a, long n, long m)
   {
       Collections.sort(a);
   int j=(int)m-1;
   long mindiff=Integer.MAX_VALUE;
   for(int i=0;j<n;i++,j++){
       mindiff=Math.min(a.get(j)-a.get(i),mindiff);
   }
   return mindiff;
   }
}