class Solution {
    public int[] replaceElements(int[] arr) {
        int v,maxv=-1,i;
        for(i=arr.length-1;i>=0;i--){
            v=arr[i];
            arr[i]=maxv;
            maxv=Math.max(v,maxv);
        }
        arr[arr.length-1]=-1;
        return arr;
        
    }
}