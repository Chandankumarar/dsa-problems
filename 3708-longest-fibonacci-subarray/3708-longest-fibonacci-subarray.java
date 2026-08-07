class Solution {
    public int longestSubarray(int[] nums) {
        int maxi=-1,count=2;
        
        for(int i=2;i<nums.length;i++){
            if(nums[i]==nums[i-1]+nums[i-2]){
                if(count<2)count=2;
                count++;

            }else{
                maxi=Math.max(count,maxi);
                count=1;
            }
        }
            maxi=Math.max(count,maxi);
        System.out.println(maxi);
        if(nums.length==3 && maxi==1)return nums.length-1;
        return maxi;
    }
}