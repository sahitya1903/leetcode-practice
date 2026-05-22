class Solution {
    public int maxArea(int[] height) {
        int left=0,right=height.length-1;
        int maxArea=0;

        while(left<=right){
            int d=right-left;
            int area=d*(Math.min(height[left],height[right]));
            if(height[left]<height[right]) left++;
            else right--;
            
            if(area>maxArea) maxArea=area;
        }
        return maxArea;

    }
}
