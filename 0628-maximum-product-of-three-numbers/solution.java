class Solution {
    public int maximumProduct(int[] nums) {
        int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE,max3=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
        for(int i:nums){
            if(i>max1){
                max3=max2;
                max2=max1;
                max1=i;
            }else if(i>max2){
                max3=max2;
                max2=i;
            }else if(i>max3){
                max3=i;
            }
        }

        for(int j:nums){
            if(j<min1){
                min2=min1;
                min1=j;
            }else if(j<min2){
                min2=j;
            }
        }
        return Math.max(max1*max2*max3,min1*min2*max1);
    }
}
