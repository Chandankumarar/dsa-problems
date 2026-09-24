class Solution {
    public int maxArea(int[] height) {
        int left=0,right=height.length-1,water=0;
        while(left<right){
            int h=Math.min(height[right],height[left]);
            int w=right-left;
            int vol=h*w;
            water=Math.max(vol,water);
            if(height[left]<height[right])left++;
            else right--;
        }
        return water;
    }
}