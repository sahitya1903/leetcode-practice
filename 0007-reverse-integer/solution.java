class Solution {
    public int reverse(int x) {
        long ans=0;
        if(x>=0){
            while(x>0){
                int c=x%10;
                ans=ans*10+c;
                x/=10;
            }
        }else{
            int n=-1*x;
            while(n>0){
                int c=n%10;
                ans=ans*10+c;
                n/=10;
            }
            ans=-1*ans;
        }
        if((int)ans!=ans) return 0;
        return (int)ans;
      
    }
}
