class Solution {
    public int lengthOfLongestSubstring(String s) {
        Queue<Character> q=new LinkedList<>();
        int res=0;
        for(char ch:s.toCharArray()){
            res=Math.max(res,q.size());
            while(q.size()>0 && q.contains(ch)){
                    q.poll();
            }
            q.offer(ch);
        }
         res=Math.max(res,q.size());
        return res;
    }
}