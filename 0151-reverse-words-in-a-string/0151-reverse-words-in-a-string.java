class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();

        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                System.out.println(sb+ " "+i);
                StringBuilder word=new StringBuilder();
                while(i>=0 && s.charAt(i)!=' '){
                    word.append(s.charAt(i));
                    i--;
                }
                if(sb.length()>0){
                    sb.append(" ");
                }
                sb.append(word.reverse());
            }
        }
        return sb.toString();
    }
}