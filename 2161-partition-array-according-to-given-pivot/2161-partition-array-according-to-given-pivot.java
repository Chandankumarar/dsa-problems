class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int less=0,count=0;
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==pivot)count++;
            else if(nums[i]<pivot)less++;
        }
        int i=0,j=less+count;
        for(int num:nums){
            if(num<pivot)res[i++]=num;
            else if(num>pivot)res[j++]=num;
            // System.out.println(Arrays.toString(res)+" "+num+" ");
        }
        for(int idx=0;idx<count;idx++){
            res[i++]=pivot;
        }
        return res;
    }
}