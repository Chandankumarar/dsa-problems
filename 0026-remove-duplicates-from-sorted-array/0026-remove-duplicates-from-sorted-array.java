class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        for(int num:nums){
            if(nums[k]==num)continue;
            k+=1;
            nums[k]=num;
        }
        
        return k+1;
    }
}