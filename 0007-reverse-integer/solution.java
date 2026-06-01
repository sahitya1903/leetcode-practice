class Solution {
    public int helper(int y) {;
        int ans=0;
        while(y>0){
            int temp=y%10;
            y/=10;
            if(ans>Integer.MAX_VALUE/10 || (ans==Integer.MAX_VALUE/10 && temp>7)) return 0;
            if(ans<Integer.MIN_VALUE/10 || (ans==Integer.MIN_VALUE/10 && temp<-8)) return 0;
            ans=ans*10+temp;
        }
        return ans;
    }

    public int reverse(int x){
        if(x>0) return helper(x);
        else return -helper(-x);
    }
}
