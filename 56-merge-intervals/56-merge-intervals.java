class Solution {
    public int[][] merge(int[][] intervals) {
        
        //declaring an array list to store the pairs
        ArrayList<int[]> list=new ArrayList<>();
        
        //sorting the given interval array based on starting point
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        
        //defining start and end point
        int start=intervals[0][0];
        int end=intervals[0][1];
        
        //we will iterate through the 2d array intervals so in each iteration we will get a row[1D array] as i
        
        for(int[] i:intervals){
            //check if end point of 1st pair if greater than the starting point of the 2nd pair or not, basically we check it's in overlapping condition or not
            
            if(i[0]<=end){
                end=Math.max(end,i[1]);
            }
            else{
                list.add(new int[]{start,end});
                start=i[0];
                end=i[1];
            }
            
        }
        
        list.add(new int[]{start,end});
        return list.toArray(new int[0][]);
        
    }
}