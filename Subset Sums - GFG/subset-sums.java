// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}
// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        
        int i=0;
        int sum=0;
        solve(list,arr,N,i,sum);
        return list;
    }
    
    static void solve(ArrayList<Integer> list,ArrayList<Integer> arr, int n,int i,int sum){
        if(i==n){
            list.add(sum);
            return;
        }
        
        //pick
        sum+=arr.get(i);
        solve(list,arr,n,i+1,sum);
        sum-=arr.get(i);
        
        //not pick
         solve(list,arr,n,i+1,sum);
        
        
    }
}