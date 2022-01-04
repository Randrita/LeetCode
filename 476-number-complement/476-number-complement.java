class Solution {
    public int findComplement(int n) {
        int ans=0;
        int count=1;
        while(n>0){
            ans+=count*(n%2==0?1:0);
            count*=2;
            n/=2;
        }
        return ans;
    }
}