class Solution {
    public int subarraySum(int[] nums, int k) {
        int total=0,count=0;
        HashMap <Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
            if(map.containsKey(total-k)){
                count+=map.get(total-k);
            }
            map.put(total,map.getOrDefault(total,0)+1);
        }
        return count;
    }
}
