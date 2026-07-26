class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == ch) {
                while (!stack.isEmpty() &&stack.peek() == ch) {
                    stack.pop();
                }
            } else
                stack.push(ch);
        }
        String str="";
        while(!stack.isEmpty()){
            str=stack.pop()+str;
        }
        return str;
    }
}