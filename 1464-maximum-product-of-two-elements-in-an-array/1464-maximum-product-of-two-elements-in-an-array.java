class Solution {
    public int maxProduct(int[] nums) {
        int i=0,j=0;
        for(int num:nums){
            if(num>=i){
                j=i;
                i=num;
            }
            else if(num<i && num>=j)j=num;
        }
        return (i-1)*(j-1);
    }
}