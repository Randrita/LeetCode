import java.util.HashSet;


class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        int j=0; // Here j represents at which index the next distinct element needs to be placed
        
        for(int i=0;i<nums.length;i++) {
            if(!set.contains(nums[i])) {
                set.add(nums[i]);
                nums[j] = nums[i];
                j++;
            } 
        }
        
        return set.size();


    }
}