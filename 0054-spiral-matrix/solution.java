class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List <Integer> list=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int startrow=0,startcol=0;
        int endrow=m-1,endcol=n-1;

        while(startrow<=endrow && startcol<=endcol){
            for(int j=startcol;j<=endcol;j++){
                list.add(matrix[startrow][j]);
            }
            for(int i=startrow+1;i<=endrow;i++){
                list.add(matrix[i][endcol]);
            }
            for(int j=endcol-1;j>=startcol;j--){
                if(startrow==endrow) break;
                list.add(matrix[endrow][j]);
            }
            for(int i=endrow-1;i>startrow;i--){
                if(startcol==endcol) break;
                list.add(matrix[i][startcol]);
            }

            startcol++; startrow++; endcol--; endrow--;
        }
        return list;

    }
}
