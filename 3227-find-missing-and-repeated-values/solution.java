class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap <Integer,Integer> map=new HashMap<>();
        int n=grid.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int c=grid[i][j];
                map.put(c,map.getOrDefault(c,0)+1);
            }
        }

        int [] arr=new int[2];

        for(int i=1;i<=n*n;i++){
            if (map.getOrDefault(i,0)==2) arr[0]=i;
            else if (map.getOrDefault(i,0)==0) arr[1]=i; 
        }
        return arr;
    }
}
