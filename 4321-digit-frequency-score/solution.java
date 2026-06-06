class Solution {
    public int digitFrequencyScore(int n) {
        int s=0;
        while(n>0){
            int d=n%10;
            s+=d;
            n/=10;
        }
        return s;

    }
}
