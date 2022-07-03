class Solution {
public int wiggleMaxLength(int[] nums) {
// return the length of the longest wiggle subsequence of nums

    // 1 3 5 2 4   
    // 1 17 16 17 18 17 
    // two increase delete the former
    // two decreaset delete the former
    
    if(nums == null || nums.length == 0){
        return 0;
    }
    if(nums.length == 1){
        return 1;
    }
    int result = 1;
    boolean firstPair = true;
    boolean positive = false;;
    
    // equal  euqal == true;
    // positive positiveFlag = true;
    // negative  flag == false and equal = false;
    int p1 = 0;
    int p2 = 1;
    while(p2 < nums.length){
        if(nums[p2] == nums[p1]){
            p2++;
            continue;
        }
        if(firstPair){
            firstPair = false;
            result++;
            positive = nums[p2] - nums[p1] > 0;
            p1 = p2;
            p2++;
            continue;
        }
        if((positive && nums[p2] - nums[p1] < 0) || (!positive && nums[p2] - nums[p1] > 0) ){
            p1= p2;
            p2++;
            result++;
            positive = !positive;
            continue;
        }
        if(positive && nums[p2] - nums[p1] > 0){
            p1 = p2;
            p2++;
            continue;
        }
        if(!positive && nums[p2] - nums[p1] < 0){
            p1 = p2;
            p2++;
            continue;
        }            
        
    }
    
    
    return result;
    
}
}