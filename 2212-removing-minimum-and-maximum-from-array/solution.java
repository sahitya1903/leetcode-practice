class Solution {
    public int minimumDeletions(int[] nums) {
        int max=nums[0], min=nums[0];
        for(int i:nums){
            max=Math.max(i,max);
            min=Math.min(i,min);
        }
        int c=0,d=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==min) c=i;
            if(nums[i]==max) d=i;
        }
        if(c==d) return 1;
        
        int left=Math.min(c,d);
        int right=Math.max(c,d);
        int frontdel=right+1;
        int backdel=nums.length-left;
        int bothdel=left+1+nums.length-right;

        return Math.min(frontdel,Math.min(backdel,bothdel));

    }
}
