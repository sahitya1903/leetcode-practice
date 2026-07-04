class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int mid=nums.length/2;
        if(map.get(nums[mid])>1) return false;
        return true;
    }
}
