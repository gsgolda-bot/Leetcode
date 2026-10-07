class Solution {

    static int is_land(int[][] grid, int r, int c, boolean[][] vis){
        if(r<0 || r>=grid.length || c<0 || c>=grid[0].length) return 0;
        if(grid[r][c]==0) return 0;
        if(vis[r][c]==true) return 0;
        vis[r][c]=true;
        int count=1;
        count+=is_land(grid, r-1, c, vis);
        count+=is_land(grid, r, c+1, vis);
        count+=is_land(grid, r+1, c, vis);
        count+=is_land(grid, r, c-1, vis);
        return count;
    }

    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
        boolean [][] vis = new boolean[grid.length][grid[0].length];
        for(int r=0;r<grid.length;r++){
            for(int c=0;c<grid[0].length;c++){
                if(grid[r][c]==1 && vis[r][c]==false){
                    int count=is_land(grid, r, c, vis);
                    if(count>max) max=count;
                }
            }
        }
        return max;
    }
}