class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leftSum[]=new int[nums.length];
        int rightSum[]=new int[nums.length];
        int left=0,right=0;
        for(int i=0;i<nums.length-1;i++){
            leftSum[i+1]=nums[i]+left;
            left=left+nums[i];
        }
        for(int i=nums.length-1;i>0;i--){
            rightSum[i-1]=nums[i]+right;
            right=right+nums[i];
        }
        
        for(int i=0;i<nums.length;i++){
            nums[i]=Math.abs(leftSum[i]-rightSum[i]);
        }

        return nums;

    }
}
