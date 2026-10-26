class Solution {
    public int numIslands(char[][] grid) {
        int res=0,row=grid.length,col=grid[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1'){
                    check(grid,i,j,row,col);
                    res++;
                }
            }
        }
        return res;
    }
    static void check(char[][] grid,int r,int c,int row,int col){
        if(r<0|| c<0|| r>=row ||c>=col ||grid[r][c]=='0')return;
        grid[r][c]='0';
        check(grid,r-1,c,row,col);
        check(grid,r,c-1,row,col);
        check(grid,r+1,c,row,col);
        check(grid,r,c+1,row,col);
    }
}