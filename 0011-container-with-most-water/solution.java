class Solution {
    public int maxArea(int[] height) {
        int left=0,right=height.length-1;
        int maxArea=Integer.MIN_VALUE;
        while(left<right){
            int dist=right-left;
            int min=Math.min(height[left],height[right]);
            int area=min*dist;

            if(area>maxArea) maxArea=area;

            if(min==height[left]) left++;
            else right--;
        }
        return maxArea;

    }
}
