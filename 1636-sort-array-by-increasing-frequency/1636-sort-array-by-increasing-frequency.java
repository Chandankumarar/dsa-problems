class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer>[] bucket=new List[nums.length+1];
        for(int key:map.keySet()){
            int freq=map.get(key);
            if(bucket[freq]==null)bucket[freq]=new ArrayList<>();
            bucket[freq].add(key);
        }
        int[] res=new int[nums.length];
        int idx=0;
        for(int i=0;i<bucket.length;i++){
            if(bucket[i]!=null){
                Collections.sort(bucket[i]);
                for(int j=bucket[i].size()-1;j>=0;j--){
                    System.out.print(bucket[i].get(j)+" ");
                    for(int k=0;k<i;k++)
                    res[idx++]=bucket[i].get(j);
                }
            }
        }
        return res;
    }
}