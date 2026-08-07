class Solution {
    public int smallestNumber(int n, int t) {
        int temp=n;
        while(true){
            if(prod(temp)%t==0) break;
            else temp++;
        }
        return temp;
    }
    public int prod(int num){
        int c=1;
        while(num!=0){
            int d=num%10;
            c*=d;
            num/=10;
        }
        return c;
    }
}
