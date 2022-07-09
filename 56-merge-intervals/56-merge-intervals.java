class Solution {
    public int[][] merge(int[][] intervals) {
        
        //declaring an array list to store the pairs
        ArrayList<int[]> list=new ArrayList<>();
        
        //sorting the given interval array based on starting point
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        
       for(int[] interval:intervals){
           if(list.size()==0){
               list.add(interval);
           }
           
           else{
               
               int[] prevInterval=list.get(list.size()-1);
               if(interval[0]<=prevInterval[1]){
                   prevInterval[1]=Math.max(prevInterval[1],interval[1]);
               }else{
                   list.add(interval);
               }
           }
       }
        
        return list.toArray(new int[list.size()][]);
        
    }
}