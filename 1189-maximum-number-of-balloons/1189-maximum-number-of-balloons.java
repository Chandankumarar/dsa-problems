class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] alp=new int[26];
        for(char ch:text.toCharArray()){
            alp[ch-'a']++;
        }
        return Math.min(
            alp['b' -'a'],Math.min(
                alp['a' -'a'],Math.min(
                    alp['l' -'a']/2,Math.min(
                        alp['o' -'a']/2,
                            alp[ 'n'-'a']))));
    }
}