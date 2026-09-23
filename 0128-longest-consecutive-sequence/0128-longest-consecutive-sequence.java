class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;

        HashSet<Integer> set=new HashSet<>();
        for(int num:nums)set.add(num);

        int longest=1;
        for(int num:set){
            if(!set.contains(num-1)){
                int curr=num,count=0;
                while(set.contains(curr)){
                    count++;
                    curr++;
                }
                longest=Math.max(longest,count);
                // System.out.println(num+" "+longest+" "+curr);
            }
        }
        return longest;

        // Arrays.sort(nums);
        // int longest=1,lastSmaller=Integer.MIN_VALUE,count=0;
        // for(int num:nums){
        //     if(num-1==lastSmaller){
        //         count++;
        //         lastSmaller=num;
        //     }else if(num==lastSmaller)continue;
        //     else {
        //         longest=Math.max(longest,count);
        //         count=1;
        //         lastSmaller=num;
        //     }
        //     longest=Math.max(longest,count);
        // }
        // return longest;
    }
}