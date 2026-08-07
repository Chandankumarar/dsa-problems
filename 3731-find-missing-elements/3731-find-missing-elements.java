class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        int mini=nums[0]+1,maxi=nums[nums.length-1],i=1;
        int sz=maxi-mini;
        while(i<nums.length){
            if(nums[i]==mini){
                i++;
            }else{
                list.add(mini);
            }
            mini++;
        }
        return list;
    }
}