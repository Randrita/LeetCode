class Solution {
    public List<Integer> majorityElement(int[] nums) {
      
        int num1=-1;
        int num2=-1;
        int count1=0;
        int count2=0;
        //int element=0;
        
        //for n/3 condition there will not be majority element more than 2
        
        //the algo
        for(int element:nums){
            
            if(num1==element) count1+=1;
            else if(num2==element) count2+=1;
            
            else if(count1==0){
                num1=element;
                count1=1;
            }
            
            else if(count2==0){
                num2=element;
                count2=1;
            }
            
            else{
                count1--;
                count2--;
            }
        }
        
        ArrayList<Integer> list=new ArrayList<>();
        count1=0;
        count2=0;
        
        //count the occurences of num1 and num2
        //add up to the list if it satisfied the n/3 condition
        
        for(int num:nums){
            if(num==num1) count1++;
            else if(num==num2) count2++;
        }
        
        if(count1>nums.length/3) list.add(num1);
        if(count2>nums.length/3) list.add(num2);
        
        return list;
    }
}