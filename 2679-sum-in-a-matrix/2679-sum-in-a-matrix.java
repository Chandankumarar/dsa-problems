class Solution {
    public int matrixSum(int[][] nums) {
        int sum=0;//r=nums.length,c=nums[0].length;
        for (int[] row : nums) {
            Arrays.sort(row);
        }
        for(int col=0;col<nums[0].length;col++){
            int maxv=0;
            for(int row=0;row<nums.length;row++){
                maxv=Math.max(maxv,nums[row][col]);
            }
            sum+=maxv;
        }
        return sum;
    }
}