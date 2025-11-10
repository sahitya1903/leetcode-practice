class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> nums=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0) nums.add(1);
                else if(j==i) nums.add(1);
                else{
                    List<Integer> prev=list.get(list.size()-1);
                    int a=prev.get(j-1)+prev.get(j);
                    nums.add(j,a);
                }
            }list.add(nums);
        }
        return list;

    }
}
