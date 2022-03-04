// { Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}

class GfG {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //testcases
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            
            //size of array
            int n = Integer.parseInt(inputLine[0]);
            Job[] arr = new Job[n];
            inputLine = br.readLine().trim().split(" ");
            
            //adding id, deadline, profit
            for(int i=0, k=0; i<n; i++){
                arr[i] = new Job(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            
            Solution ob = new Solution();
            
            //function call
            int[] res = ob.JobScheduling(arr, n);
            System.out.println (res[0] + " " + res[1]);
        }
    }
}// } Driver Code Ends


class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        //1st step is to sort the array based on profit in descending order
        Arrays.sort(arr, (a,b)-> b.profit-a.profit);
        
        //find out the maximum deadline to create an array
        int maxi=0;
        for(int i=0;i<n;i++){
            if(arr[i].deadline>maxi){
                maxi=arr[i].deadline;
            }
        }
        
        //create the array nd fill it with -1
        int[] check=new int[maxi+1];
        Arrays.fill(check,-1);
        
        //traversal
        int countJob=0;
        int maxProfit=0;
        for(int i=0;i<n;i++){
            for(int j=arr[i].deadline;j>0;j--){
                if(check[j]==-1){
                    check[j]=arr[i].id;
                    countJob+=1;
                    maxProfit +=arr[i].profit;
                    break;
                }
            }
        }
    int[] ans=new int[2];
    ans[0]=countJob;
    ans[1]=maxProfit;
    
    return ans;
    }
}