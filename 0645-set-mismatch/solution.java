class Solution {
    public int[] findErrorNums(int[] nums) {
        int freq[]=new int[nums.length+1];
        int res[]=new int[2];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }

        for(int i=0;i<freq.length;i++){
            if(freq[i]==2) res[0]=i;
            else if(freq[i]==0) res[1]=i;
        }
        
        return res;
    }
}
