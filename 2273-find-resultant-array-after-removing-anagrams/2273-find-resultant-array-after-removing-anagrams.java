class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> res=new ArrayList<>();
        int idx=0;
        String check="";
        for(int i=0;i<words.length;i++){
            String s=words[i];
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String t=new String(ch);
            System.out.println(i+" "+s+" "+t+" "+check);
            if(res.size()==0){
                res.add(s);
                check=t;
            }
            else if(check.equals(t))continue;
            else{
                res.add(s);
                check=t;
            }
        }
        return res;
    }
}