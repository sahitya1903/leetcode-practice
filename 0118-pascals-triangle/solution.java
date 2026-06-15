class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        pascal.add(Arrays.asList(1));
        for(int i=1;i<numRows;i++){
            List<Integer>prev=pascal.get(i-1);
            List<Integer>curr= new ArrayList<>();
            curr.add(1);
            for(int j=1;j<i;j++){
                curr.add(prev.get(j-1)+prev.get(j));
            }
            curr.add(1);
            pascal.add(curr);
        }
        return pascal;
    }
}
