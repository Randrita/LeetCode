// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int m = Integer.parseInt(inputLine[1]);
            int arr1[] = new int[n];
            int arr2[] = new int[m];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr1[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                arr2[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().merge(arr1, arr2, n, m);

            StringBuffer str = new StringBuffer();
            for (int i = 0; i < n; i++) {
                str.append(arr1[i] + " ");
            }
            for (int i = 0; i < m; i++) {
                str.append(arr2[i] + " ");
            }
            System.out.println(str);
        }
    }
}// } Driver Code Ends


class Solution {

   public void merge(int arr1[], int arr2[], int n, int m) {
        
        
    int gap  =  n+m;
    int i = 0, j = 0;
    for(gap = nextGap(gap); gap>0; gap = nextGap(gap)) {
        for(i = 0; i+gap<n; i++) {
            if(arr1[i] > arr1[i+gap])
            arr1[i] += arr1[i+gap] -  (arr1[i+gap] = arr1[i]);
        }
        
        for(j = (gap >n) ? (gap-n):0; i<n && j<m; i++, j++) {
            if(arr1[i] > arr2[j]) 
            arr1[i] += arr2[j] - (arr2[j] = arr1[i]);
        }
        if(j < m) {
            for(j = 0; j+gap<m; j++) {
                if(arr2[j] > arr2[j+gap])
                arr2[j] += arr2[j+gap] - (arr2[gap+j] = arr2[j]);
            }
        }
    }
   }
   int nextGap(int gap) {
       if(gap <= 1)
       return 0;
       return (gap/2 + gap%2);
   }
}