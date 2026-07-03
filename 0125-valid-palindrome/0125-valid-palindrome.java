class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        for(char ch:s.toCharArray()){
            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9'))
            str+=Character.toLowerCase(ch);
        }
        int j=str.length()-1,i=0;
        while(i<j){
            if(str.charAt(i)==str.charAt(j)){
                j--;
                i++;
            }else{
                return false;
            }
        }
        return true;
    }
}