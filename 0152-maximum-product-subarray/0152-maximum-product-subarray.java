class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==1)return nums[0];
        int res=0;
        for(int i=0;i<nums.length;i++){
            int pro=1;
            for(int j=i;j<nums.length;j++){
                pro*=nums[j];
                res=Math.max(res,pro);
            }
            res=Math.max(res,pro);
        }
        return res;
    }
}