class Solution {
    public double myPow(double x, int n) {
        if(n<0){
            long val=n;
            return 1/helper(x,(int)-val);
        }
        else if(n==0) return 1;
        else return helper(x,n);
    }
    public double helper(double x, long n){
        if(n==0) return 1;
        double ans=helper(x,n/2);
        if(n%2==0){
            return ans*ans;
        }else{
            return x*ans*ans;
        }
    }
}
