class Solution {
    public String reversePrefix(String word, char ch) {
        String t=""+ch;
        if(!word.contains(t))return word;
        int idx=-1;
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            stack.push(c);
            if(ch==c){
                idx=i;
                break;
            }
        }
        String str="";
        while(!stack.isEmpty()){
            str=str+stack.pop();
        }
        for(int i=idx+1;i<word.length();i++){
            str=str+word.charAt(i);
        }
        return str;
    }
}