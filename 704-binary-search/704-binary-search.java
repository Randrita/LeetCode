class Solution {
    int index=0;
    public int search(int[] nums, int target) {
        if(index>nums.length-1){
            return -1;
        }
        
        if(nums[index]==target){
            return index;
        }
        
        index+=1;
        return search(nums,target);
    
    }
}