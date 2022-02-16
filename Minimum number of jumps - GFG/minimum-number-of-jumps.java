// { Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 

        while(t-- > 0){
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr= new int[size];
            for(int i = 0;i<size;i++){
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution().minJumps(arr));
        }
	 }
	 
}
// } Driver Code Ends

class Solution{
    static int minJumps(int[] a){
        int n = a.length;
        if(n == 1){
            return 0;
        }
        if(a[0] == 0){
            return -1;
        }
        int steps = a[0];
        int maxreach = a[0];
        int jumps = 1;
        for(int i=1; i<n; i++){
            if(i == n-1){
                return jumps;
            }
            maxreach = Math.max(maxreach, i+a[i]);
            steps--;
            if(steps == 0){
                jumps++;
                if(i >= maxreach){
                    return -1;
                }
                steps = maxreach - i;
            }
        }
        return -1;
    }
}