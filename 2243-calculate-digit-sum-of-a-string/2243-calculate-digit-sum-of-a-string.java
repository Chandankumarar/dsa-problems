class Solution {
    public String digitSum(String s, int k) {
        String res="";
        int n=s.length();
        while(s.length()>k){
            String temp="";
            int t=0;
            for(int i=0;i<s.length();i++){
                t +=(s.charAt(i) - '0');
                if((i + 1) % k == 0 || i == s.length() - 1) {
                 System.out.println(temp);
                    temp+=t;
                    t=0;
                };
            }
            s=temp;
        }
        return s;
    }
}