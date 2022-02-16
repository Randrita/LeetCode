// { Driver Code Starts
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
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}// } Driver Code Ends


class Solution
{
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        ArrayList<Integer> a = new ArrayList<Integer>();
        
        int minr=0;
        int minc=0;
        int maxr=r-1;
        int maxc=c-1;
        
        int count=0;
        int v=r*c;
        
        while(count<v){
            //top
        for(int i=minr,j=minc;j<=maxc && count<v;j++){
            a.add(matrix[i][j]);
            count++;
        }
        
        minr++;
        
        //right
        for(int i=minr,j=maxc;i<=maxr && count<v;i++){
            a.add(matrix[i][j]);
            count++;
        }
        
        maxc--;
        
        //bottom
        for(int i=maxr,j=maxc;j>=minc && count<v;j--){
            a.add(matrix[i][j]);
            count++;
        }
        maxr--;
        
        //left
        for(int i=maxr,j=minc;i>=minr && count<v;i--){
            a.add(matrix[i][j]);
            count++;
        }
        minc++;
        }
        return a;
    }
}
