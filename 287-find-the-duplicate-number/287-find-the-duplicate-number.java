import java.util.*;

class Solution {
    public int findDuplicate(int[] nums) {
     Arrays.sort(nums);
     int sol=0;
     for(int j=0;j<nums.length-1;j++){
            if(nums[j]==nums[j+1]){
                sol=nums[j];
            }
        }
        
        return sol;

    }
}