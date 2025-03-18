class Solution {
    public int longestNiceSubarray(int[] nums) {
        int min=1;
        for(int i=0;i<nums.length;i++){
            boolean flag=true;
            for(int j=i;j<nums.length;j++){
                for(int k=i;k<j;k++){
                    if((nums[j] & nums[k])!=0){
                        flag=false;
                        break;
                    }
                }
                if(flag==true){
                    min=Math.max(min,j-i+1);
                } else{
                    break;
                }
            }
        }
        return min;
    }
}
