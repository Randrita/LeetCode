class Solution {
    public int candy(int[] r) {
        int n=r.length;
        int[] arr=new int[n];
        
        if(n == 1){
            return 1;
        }
        
        //fill the array with 1
        for(int i=0;i<n;i++){
            arr[i]=1;
        }
        
        //Left to right traversal to check if the neighbour element is greater or not
        
        for(int i=1;i<n;i++){
            if(r[i]>r[i-1] && arr[i]<=arr[i-1]){
                arr[i]=arr[i-1]+1;
            }
        }
        
        //Right to left travarsal
        for(int i=n-2;i>=0;i--){
            if(r[i]>r[i+1] && arr[i]<=arr[i+1]){
                arr[i]=arr[i+1]+1;
            }
        }
        
        int res=0;
        //count the candies
        for(int x:arr){
            res+=x;
        }
        
        return res;
    }
}