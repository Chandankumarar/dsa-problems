class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0)return false;
        int row=matrix.length;
        int col=matrix[0].length;
        int low=0,high=matrix.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(target>=matrix[mid][0] && target<=matrix[mid][col-1]){
                int i=0,j=matrix[mid].length-1;
                System.out.println(i+" "+j);
                while(i<=j){
                    int c=(i+j)/2;
                    if(matrix[mid][c]==target)return true;
                    else if(matrix[mid][c]>target)j=c-1;
                    else i=c+1;
                }return false;
            }else if(matrix[mid][0]>target)high=mid-1;
            else low=mid+1;
        }
        return false;
    }
}