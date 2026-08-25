class Solution {
    public int missingMultiple(int[] nums, int k) {
        List<Integer> list=new ArrayList<>();
        for(int i:nums){
            if(i%k==0) list.add(i);
        }
        
        for(int i=k;i<=k*list.size()+k;i+=k){
            if(!list.contains(i)) return i;
        }
        return -1;
    }
}
