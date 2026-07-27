class Solution {
    public int maximumProduct(int[] nums) {
        int n1=Integer.MIN_VALUE,n2=Integer.MIN_VALUE,n3=Integer.MIN_VALUE,min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
        for(int num:nums){
            if(num>n1){
                n3=n2;
                n2=n1;
                n1=num;
            }else if(num>n2){
                n3=n2;
                n2=num;
            }else if(num>n3)n3=num;
            if(num<min1){
                min2=min1;
                min1=num;
            }else if(num<min2){
                min2=num;
            }
        }
        return Math.max(n1*n2*n3,n1*min1*min2);
    }
}