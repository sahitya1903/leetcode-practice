class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        // int n=nums.length;
        // int maxSum=0;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if((j-i)>=k){
        //             int sum=nums[i]+nums[j];
        //             maxSum=Math.max(sum,maxSum);
        //         }
        //     }
        // }
        // return maxSum;

        int n=nums.length;
        int leftmax=nums[0];
        int maxSum=Integer.MIN_VALUE;
        for(int j=k;j<n;j++){
            leftmax=Math.max(leftmax,nums[j-k]);
            maxSum=Math.max(maxSum,leftmax+nums[j]);
        }
        return maxSum;
    }
}
