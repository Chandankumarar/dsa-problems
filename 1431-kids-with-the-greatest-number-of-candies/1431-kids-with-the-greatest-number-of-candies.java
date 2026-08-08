class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int great=0;
        List<Boolean> res=new ArrayList<>();
        for(int i:candies){
            if(i>great)great=i;
        }
        for(int i:candies){
            if(i+extraCandies>=great)res.add(true);
            else res.add(false);
        }
        return res;
    }
}