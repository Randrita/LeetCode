class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // We assume the smallest 
        int l=1,r=piles[0];
        
        // To get the smallest and the largest pile.
        for(int pile: piles){
           r=Math.max(pile,r);
        }
        
        // Now we will do a binary search between the largest and the smallest pile 
        // to find a suitable speed which is lowest and yet can help to finish bananas in
        // given time 'h'.
        int mid=0;
        while(l<r){
            mid=(l+r)/2;
            if(h<timeTaken(piles, mid)) //speed up
                l=mid+1;
            else //slow down
                r=mid;
        }
        return l;
    }
    int timeTaken(int[] piles, int speed){
        int c=0;
        for(int pile: piles){
            c+=Math.ceil((double) pile / speed);
        }
        return c;
    }
}
