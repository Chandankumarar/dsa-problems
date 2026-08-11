class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]*=2;
                nums[i+1]=0;
            }
        }
        int k=0;
        for(int num:nums){
            if(num!=0){
                nums[k]=num;
                k++;
            }
        }
        for(int i=k;i<nums.length;i++)nums[i]=0;
        return nums;
    }
}