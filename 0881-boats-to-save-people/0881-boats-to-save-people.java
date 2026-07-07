class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int count=0;
        Arrays.sort(people);
        int i=0,j=people.length-1;
        while(i<=j){
            if(people[i]+people[j]<=limit){
                count++;
                i++;
                j--;
            }
            else if(people[i]==limit){
                count++;;
                i++;
            }
            else{
                count++;
                j--;
            } 
        }
        return count;
    }
}