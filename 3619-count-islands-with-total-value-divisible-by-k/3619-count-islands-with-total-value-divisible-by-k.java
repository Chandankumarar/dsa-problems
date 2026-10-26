class Solution {
    public int countIslands(int[][] grid, int k) {
        int res=0;
        int row=grid.length;
        int col=grid[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]!=0){
                    long sum=check(grid,i,j,row,col);
                    if(sum%k==0)res++;
                }
            }
        }
        return res;
    }
    
    static long check(int[][] grid ,int r,int c,int row,int col){
        if(r<0 || r>=row|| c<0 || c>=col ||grid[r][c]==0){
            return 0;
        }
        long sum=(long)grid[r][c];
        grid[r][c]=0;
        sum+=check(grid,r-1,c,row,col)+check(grid,r,c-1,row,col)+
            check(grid,r+1,c,row,col)+check(grid,r,c+1,row,col);
        return sum;
    }
}