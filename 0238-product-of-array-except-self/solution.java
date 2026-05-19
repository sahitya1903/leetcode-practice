class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int [] pref=new int[n];
        int [] suff=new int [n];
        int p=1;
        pref[0]=1;
        for(int i=1;i<n;i++){
            p*=nums[i-1];
            pref[i]=p;
        }
        int s=1;
        suff[n-1]=1;
        for(int i=n-2;i>=0;i--){
            s*=nums[i+1];
            suff[i]=s;
        }

        int[] res=new int[n];
        for(int i=0;i<n;i++){
            res[i]=pref[i]*suff[i];
        }
        return res;   
    }
}
