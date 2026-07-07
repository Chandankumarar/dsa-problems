class Solution {
    public int maxArea(int[] height) {
        int left=0,right=height.length-1;
        int water=Integer.MIN_VALUE;
        while(left<right){
            int x=Math.min(height[left],height[right]);
            int y=right-left;
            water=Math.max(water,x*y);
            if(height[left]<height[right])left++;
            else right--;
        }
        return water;
    }
}