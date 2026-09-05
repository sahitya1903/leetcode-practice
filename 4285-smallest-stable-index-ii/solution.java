class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int [] prefMax=new int[nums.length];
        prefMax[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>prefMax[i-1]){
                prefMax[i]=nums[i];
            }else{
                prefMax[i]=prefMax[i-1];
            }
        }

        int[] suffMin=new int[nums.length];
        suffMin[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<suffMin[i+1]){
                suffMin[i]=nums[i];
            }else{
                suffMin[i]=suffMin[i+1];
            }
        }

        for(int i=0;i<nums.length;i++){
            if((prefMax[i]-suffMin[i])<=k) return i;
        }
        return -1;
    }
}
