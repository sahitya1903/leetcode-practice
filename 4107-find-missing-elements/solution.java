class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max=nums[0], min=nums[0];
        boolean[] temp=new boolean[1000];
        for(int i:nums){
            if(i>max) max=i;
            if(i<min) min=i;
            temp[i]=true;
        }
        List<Integer> list=new ArrayList<>();
        for(int i=min;i<=max;i++){
            if(!temp[i]) list.add(i);
        }
        return list;
    }
}
