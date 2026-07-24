class Solution {
    public int uniqueXorTriplets(int[] nums) {
        boolean[] temp=new boolean[2048];
        boolean[] ans=new boolean[2048];
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                temp[nums[i]^nums[j]]=true;
            }
        }

        for(int i=0;i<2048;i++){
            if(!temp[i]) continue;

            for(int j:nums){
                ans[i^j]=true;
            }
        }

        int res=0;
        for(boolean i:ans){
            if(i) res++;
        }
        return res;
    }
}
