class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map=new HashMap<>();
        for(String s:words){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        List<String>[] bucket=new List[words.length+1];
        for(String key:map.keySet()){
            int freq=map.get(key);
            if(bucket[freq]==null)
                bucket[freq]=new ArrayList<>();
            int idx=-1;
            for(int i=0;i<bucket[freq].size();i++){
                String s=bucket[freq].get(i);            
                if (s.compareTo(key) > 0) {
                    idx = i;
                    break;
                }  
            }
            if(idx==-1)bucket[freq].add(key);
            else bucket[freq].add(idx,key);
        }
        for(String key:map.keySet()){
            System.out.println(key+ " " +map.get(key));
        }
        int count=0;
        List<String> res=new ArrayList<>();
        for(int i=bucket.length-1;i>=0 && count<k;i--){
            if(bucket[i]!=null){
                for(String s:bucket[i]){
                    // System.out.print(s+" ");
                    if(count<k){
                        res.add(s);
                        count++;
                    }
                }
            }
        }
        return res;
    }
}