class Solution {
    public int reverse(int n){
        int s=0;
        while(n>0){
            int d=n%10;
            s=s*10+d;
            n/=10;
        }
        return s;
    }
    public int mirrorDistance(int n) {
        return Math.abs(n-reverse(n));
    }
}
