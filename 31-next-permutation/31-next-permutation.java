class Solution {
    public void nextPermutation(int[] nums) {
        
        //edge cases
        if(nums.length==1){
            return;
        }
        
        //finding 1st index
        int idx1=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx1=i;
                break;
            }
        }
   
        //if there's no such permutation exists
        if(idx1<0){
            reverse(nums,0,nums.length-1);
            return;
        }
        
        
        //finding 2nd index
        int idx2=0;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[idx1]<nums[i]){
                idx2=i;
                break;
            }
        }
        
        swap(nums,idx1,idx2);
        reverse(nums,idx1+1,nums.length-1);
             
    }
    
    public void swap(int[] A, int i, int j) {
    int tmp = A[i];
    A[i] = A[j];
    A[j] = tmp;
   }

   public void reverse(int[] A, int i, int j) {
    while(i < j) swap(A, i++, j--);
   }
    
    
}