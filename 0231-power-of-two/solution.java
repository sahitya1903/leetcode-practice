class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1) return true;
        int c=(int)(Math.log(n)/Math.log(2));
        int p=1;
        for(int i=0;i<=c;i++){
            p*=2;
            if(p==n) return true;
        }
        return false;
    }
}
