// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str[] = read.readLine().trim().split(" ");
            int n = Integer.parseInt(str[0]);
            
            int arr[] = new int[n];
            int dep[] = new int[n];
            
            str = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
              arr[i] = Integer.parseInt(str[i]);
            str = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                dep[i] = Integer.parseInt(str[i]);
                
            System.out.println(new Solution().findPlatform(arr, dep, n));
        }
    }
    
    
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int findPlatform(int arr[], int dep[], int n)
    {   
        // sort both the arrays first
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        //using two pointers
        int i=1;
        int j=0;
        int result=1;
        int plat=1;
        
        while(i<n && j<n){
            if(arr[i]<=dep[j]){
                plat+=1;
                i++;
            }
            
            else if(arr[i]>dep[j]){
                plat-=1;
                j++;
            }
            
            if(result<plat){
                result=plat;
            }
        }
        
        return result;
        
        
    }
    
}

