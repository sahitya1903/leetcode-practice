class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap <Integer,Integer> map=new HashMap<>();
        int n=grid.length;
        int a=-1, b=-1;
        for(int[] r:grid){
            for(int num:r){
                map.put(num,map.getOrDefault(num,0)+1);
            }
        }

        for(int i=1;i<=n*n;i++){
            if(!map.containsKey(i)) b=i;
            else if(map.get(i)==2) a=i;
        }

        return new int[] {a,b};

    }
}
