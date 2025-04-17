class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            String str=String.valueOf(i);
            int n=str.length();
            int mid=str.length()/2;
            if(n%2==0){
                int lsum=0,rsum=0;
                for(int j=0;j<mid;j++){
                    lsum=lsum+str.charAt(j)-'0';
                    rsum=rsum+str.charAt(j+mid)-'0';
                }
                if(lsum==rsum){
                    count=count+1;
                }
            }
        }
        return count;
    }
}
