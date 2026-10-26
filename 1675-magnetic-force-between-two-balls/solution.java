class Solution {
    public boolean isPossible(int minAllowedDistance, int[] position, int m, int n){
        int ball=1;
        int lastBasket=position[0];
        for(int i=0;i<n;i++){
            if(position[i]-lastBasket>=minAllowedDistance){
                ball++;
                lastBasket=position[i];
            }

            if(ball==m) return true;
        }
        return false;
    }

    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n=position.length;
        int low=1, high=position[n-1]-position[0], ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(mid,position,m,n)){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
}
