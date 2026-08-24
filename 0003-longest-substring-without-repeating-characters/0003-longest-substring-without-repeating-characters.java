class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxv=0,n=s.length();
        int left=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int r=0;r<n;r++){
            char ch=s.charAt(r);
            if(map.containsKey(ch) && map.get(ch)>=left){
                left=map.get(ch)+1;
            }
            maxv=Math.max(maxv,r-left+1);
            map.put(ch,r);
        }
        return maxv;
    }
}