class Solution {
    public boolean checkDivisibility(int n) {
        int a=n;
        int sum=0, prod=1;
        while(a>0){
            int d=a%10;
            sum+=d;
            prod*=d;
            a/=10;
        }
        if(n%(sum+prod)==0) return true;
        return false;
    }
}
