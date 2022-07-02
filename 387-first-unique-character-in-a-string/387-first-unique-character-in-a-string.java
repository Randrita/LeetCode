class Solution {
    public int firstUniqChar(String s) {
        
        //initialising an array of 26 char
        int[] arr=new int[26];
        
        //count the occurences of each alphabate
        for(char ch:s.toCharArray()){
            arr[ch-'a']+=1;
        }
        
        for (int i=0;i<s.length();i++){
            if(arr[s.charAt(i)-'a']==1){
                return i;
            }
        }
        
        return -1;
    }
}