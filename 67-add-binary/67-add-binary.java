class Solution {
    public String addBinary(String a, String b) {
        String ans="";
        int carry=0;
        int i=0;
        
        while(i<a.length()||i<b.length() || carry !=0){
            
            int x=0;
            if( i<a.length()  && a.charAt(a.length()-1-i)=='1'){
                x=1;
            }

            int y=0;
            if(i<b.length() && b.charAt(b.length()-1-i)=='1'){
                y=1;
            }

            
            //calculation
            ans=(x+y+carry)%2+ans;
            carry=(x+y+carry)/2;
            i++;
        }
        return ans;
    }
}