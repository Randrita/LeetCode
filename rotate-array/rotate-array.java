class Solution {
    public void rotate(int[] nums, int k) {
     
        k=k%nums.length;
        int n= nums.length-1;
        
        //reverse part 1
        reverse(nums,0,n-k);
        
        //reverse part 2
        reverse(nums,nums.length-k,nums.length-1);
        
        
        //reverse the array
         reverse(nums,0,nums.length-1);
        
    }
    
    public static void reverse(int[] nums,int i,int j){
        
        int temp;
        int l=i;
        int h=j;
        while(l<h){
            temp=nums[l];
            nums[l]=nums[h];
            nums[h]=temp;
            l++;
            h--;
        }
    }
}