class Solution {
    public void sortColors(int[] nums) {
        //three pointers method/A variation of Dutch National Flag Algorithm
        
        int low=0;
        int mid=0;
        int high=nums.length-1;
        int temp;
        
        /*Idea- when nums[mid]=1  --->  increase mid pointer
                 when nums[mid]=0 ----> swap it with low pointer and low++ , mid++
                 when nums[mid]=2 ----> swap with high and high--,mid++ */
        
        while(mid<=high){
            
            switch(nums[mid]){
                case 0:
                    temp = nums[low];
                    nums[low]=nums[mid];
                    nums[mid]=temp;
                    low+=1;
                    mid+=1;
                    break;
                    
                case 1:
                    mid+=1;
                    break;
                    
                case 2:
                    temp = nums[mid];
                    nums[mid]=nums[high];
                    nums[high]=temp;
                    
                    high--;
                    
                    break;
            }
        }
    } 
}