class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())return false;
        int[] freq=new int[26];
        int[] window=new int[26];
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
            window[s2.charAt(i)-'a']++;
        }
        int left=0;
        if(Arrays.equals(freq, window))return true;
        for(int i=s1.length();i<s2.length();i++){
            char ch=s2.charAt(i);
            window[s2.charAt(left)-'a']--;
            window[s2.charAt(i)-'a']++;
            if(Arrays.equals(freq, window))return true;
            left++;
        }
        return false;
    }
}