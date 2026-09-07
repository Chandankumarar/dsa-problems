class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res=new ArrayList<>();
        int n=s.length(),window=p.length(),l=0,r=0;
        if(p.length()>s.length())return res;
        int ptrn[] =new int[26];
        int[] arr=new int[26];
        for(char ch:p.toCharArray()){
            ptrn[ch-'a']++;
        }
        for(r=0;r<window;r++){
            arr[s.charAt(r)-'a']++;
        }

        if(Arrays.equals(arr,ptrn))res.add(l);
        while(r<n){
            arr[s.charAt(l)-'a']--;
            arr[s.charAt(r)-'a']++;
            r++;
            l++;
            if(Arrays.equals(arr,ptrn)){
                res.add(l);
                // System.out.println(l);
            }
        }
        return res;
    }
}