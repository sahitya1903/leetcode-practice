class Solution {
    public int smallestRepunitDivByK(int k) {
        if(k%2==0 || k%5==0){
            return -1;
        }else{
            int n=1, c=1;
            while(n%k!=0){
                c++;
                n=(n*10+1)%k;
            }
            return c;
        }
    }
}
