class Solution {
    public int[] constructRectangle(int area) {
        int l=1;
        for(int i=1;i<=Math.sqrt(area);i++){
            if(area%i==0) l=i;
        }
        int w=area/l;
        return new int[] {w,l};
    }
}
