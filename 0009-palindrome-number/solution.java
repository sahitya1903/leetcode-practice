class Solution {
    public boolean isPalindrome(int x) {
       int ans=0,temp=x;
       while(temp>0){
        int mod=temp%10;
        ans=ans*10+mod;
        temp/=10;
       }
       if(ans==x) return true;
       else return false;
    }
}
