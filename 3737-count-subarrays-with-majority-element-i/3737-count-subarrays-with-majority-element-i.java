class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int targetcount=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==target)targetcount++;
                int len=j-i+1;
                if(targetcount*2>len)count++;
            }
        }
        return count;
    }
}