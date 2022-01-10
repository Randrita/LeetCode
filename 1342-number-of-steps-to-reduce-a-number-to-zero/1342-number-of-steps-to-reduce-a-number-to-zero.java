class Solution {
    int count=0;
    public int numberOfSteps(int num) {
       if(num==0){return count;}
       if(num%2==0){ 
           count+=1;
           return numberOfSteps(num/2);
       }
       count+=1;
       return numberOfSteps(num-1);
    }
}