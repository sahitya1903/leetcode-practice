class Solution {
    public boolean check(int a){
        while(a>0){
            int c=a%10;
            if(c==0) return false;
            a/=10;
        }
        return true;
    }

    public int[] getNoZeroIntegers(int n) {
        for(int i=1;i<n;i++){
            if(check(i) && check(n-i)){
                int arr[]={i,n-i};
                return arr;
            }
        }return new int[2];
    }
}
