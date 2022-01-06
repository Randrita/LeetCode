import java.util.*;

class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        
       
        
        int maxDropValue=-1;
        //boolean flag= true;
        for(int dropValue[]:trips){
            if(dropValue[0]>capacity){
                return false;
            }
            maxDropValue=Math.max(maxDropValue,dropValue[2]);
        }
        
        int[] arr = new int[maxDropValue+1];
        
        for(int value[]:trips){
            arr[value[1]] += value[0];
            arr[value[2]] -= value[0];
        }
        
        // cumulative sum
        for(int i=1;i<=maxDropValue;i++){
            arr[i]+=arr[i-1];
            if(arr[i]>capacity){
                return false;
            }
        }
        return true;
    }
}