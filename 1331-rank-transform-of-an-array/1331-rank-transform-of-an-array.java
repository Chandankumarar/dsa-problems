class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] temp = arr.clone();
        Arrays.sort(temp);
        int rank=1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:temp){
            if(!map.containsKey(i)){
            map.put(i,rank++);
            }
        }
        int[] ans=new int[arr.length];
       for(int i=0;i<arr.length;i++){
        ans[i]=map.get(arr[i]);
       }

       return ans;
    }
}