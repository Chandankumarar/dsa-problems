class Solution {
    public long sumAndMultiply(int n) {
        int x=0,sum=0;
        String str=""+n;
        for(char ch:str.toCharArray()){
            if(ch!='0'){
                x=x*10+ch-'0';
                sum+=ch-'0';
            }
        }
        return (long)sum*x;
    }
}