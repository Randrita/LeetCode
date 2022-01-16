class Solution {
    int i=0;
    int prefix=-1;
    int mid=-1;
    int suffix=-1;
    int count=0;
    
    public int maxDistToClosest(int[] seats) {
        while(i<seats.length){
            if(seats[i]==0){
                count+=1;
                
            }
            else{
                if(prefix==-1){
                    prefix=count;
                }
                
                else{
                    mid=Math.max(mid,count);
                }
                
                count=0;
            }

            
            i++;
        }
        
        suffix=count;
        
        return Math.max(Math.max(prefix,suffix),(mid+1)/2);
    

    }
}