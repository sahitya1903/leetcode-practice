class Solution {
    public int sum(int x){
        return (x*(x+1)/2);
    }

    public int pivotInteger(int n) {
        for(int i=1;i<=n;i++){
            if(sum(n)+i==2*sum(i)) return i;
        }
        return -1;
    }
}
