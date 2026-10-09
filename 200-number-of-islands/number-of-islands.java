class Solution {
    
    static void is_land(char [][] grid,int r, int c, boolean[][] vis){
        if(r<0 || r>=grid.length || c<0 || c>=grid[0].length) return;    //boundary
        if(grid[r][c]=='0') return;                                      //water
        if(vis[r][c]==true) return;                                      //vis 
        vis[r][c]=true;
            is_land(grid, r-1, c, vis); 
            is_land(grid, r, c+1, vis);
            is_land(grid, r+1, c, vis);
            is_land(grid, r, c-1, vis);
    }

    public int numIslands(char[][] grid) {
        boolean[][] vis=new boolean[grid.length][grid[0].length];
        int count=0;
        for(int r=0;r<grid.length;r++){
            for(int c=0;c<grid[0].length;c++){
                if(grid[r][c]=='1' && vis[r][c]==false){
                    count++;
                    is_land(grid, r, c, vis);
                }
            }
        }    
        return count;
    }
}