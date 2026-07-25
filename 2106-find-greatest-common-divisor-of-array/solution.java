class Solution {
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i:nums){
            if(i<min) min=i;
            if(i>max) max=i;
        }

        while(max>0){
            if(min==0) return max;
            int rem=max%min;
            max=min;
            min=rem;
        }
        return min;
    }
}
