class Solution {
    public int islandPerimeter(int[][] grid) {
        int count = 0;
        for(int a=0;a<grid.length;a++) {
            for(int b=0;b<grid[a].length;b++) {
                if(grid[a][b]==1) {
                    if(a==0)
                        count++;
                    if(a==grid.length-1)
                        count++;
                    if(b==0)
                        count++;
                    if(b==grid[a].length-1)
                        count++;
                    if(b<grid[a].length-1 && grid[a][b+1]==0)
                        count++;
                    if(b>0 && grid[a][b-1]==0)
                        count++;
                    if(a<grid.length-1 && grid[a+1][b]==0)
                        count++;
                    if(a>0 && grid[a-1][b]==0)
                        count++;
                }
            }
        }
        return count;
    }
}