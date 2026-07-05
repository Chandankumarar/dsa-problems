class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0,val=nums[0],count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==val && count<2){
                j++;
                nums[j]=nums[i];
                count++;
            }else{
                 if(nums[i]!=nums[j]){
                    j++;
                nums[j]=nums[i];
                val=nums[i];
                count=1;
            }
            }
        }
        return j+1;
    }
}