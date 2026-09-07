class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        backtrack(res,new ArrayList<>(),nums);
        return res;
    }
    static void backtrack(List<List<Integer>> res,List<Integer> temp,int[] nums){
        if(temp.size()==nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int n:nums){
            if(temp.contains(n))continue;
            temp.add(n);
        // System.out.println(temp+" "+temp.size());
            backtrack(res,temp,nums);
            temp.remove(temp.size()-1);
        }
    }
}