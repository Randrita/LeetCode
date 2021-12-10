import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> candyList=new ArrayList<Boolean>(candies.length);
        int max=candies[0];
        int temp;
        
        for(int i=1;i<candies.length;i++){
            max=Math.max(max,candies[i]);
        }
        
        
        for(int i=0;i<candies.length;i++){
            temp=candies[i]+extraCandies;
            
            if(temp>=max){
                candyList.add(true);
            }
            
            else{
                candyList.add(false);
            }
          
        }
        
        return candyList;
    }
}