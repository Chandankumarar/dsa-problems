class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] ans=new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
            ans[i+nums.length]=nums[nums.length-1-i];
        }
        return ans;
    }
}