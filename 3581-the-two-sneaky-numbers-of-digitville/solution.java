class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Set <Integer> set=new HashSet<>();
        int arr[]=new int[2];
        int c=0;
        for(int i:nums){
            if(set.contains(i)){
                arr[c]=i;
                c++;
            }
            set.add(i);
        }
        return arr;
    }
}
