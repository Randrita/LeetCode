class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        
        int[] arr=new int[nums.length];
        int count;
        
        for(int i=0;i<nums.length;i++){
            count=0;
            for(int j=0;j<nums.length;j++){
                if(i==j){
                    continue;
                }
                if(nums[j]<nums[i]){
                    count++;
                }
               
            }
            
            arr[i]=count;
            
        }
        
        return arr;
        
    }
}