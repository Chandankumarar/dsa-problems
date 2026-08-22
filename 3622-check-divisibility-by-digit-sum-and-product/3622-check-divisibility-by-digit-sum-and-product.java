class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0,pro=1;
        int num=n;
        while(num!=0){
            int digit=num%10;
            sum+=digit;
            pro*=digit;
            num=num/10;
        }  
        System.out.println(sum+" "+pro); 
        return n%(sum+pro)==0;
    }
}