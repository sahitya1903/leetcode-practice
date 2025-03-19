class Solution {
    public int minOperations(int[] nums) {
        int min=0;
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]==0){
                nums[i]=1;
                nums[i+1]=(nums[i+1]+1)%2;
                nums[i+2]=(nums[i+2]+1)%2;
                min++;
            }
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=1){
                return -1;
            }
        }
        return min;
    }
}
