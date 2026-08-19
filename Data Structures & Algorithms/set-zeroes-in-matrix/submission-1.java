class Solution {
    public void setZeroes(int[][] matrix) {
        for(int a=0;a<matrix.length;a++) {
            for(int b=0;b<matrix[a].length;b++)
                if(matrix[a][b]==0) {
                    for(int d=0;d<matrix[a].length;d++)
                        if(matrix[a][d]!=0)
                            matrix[a][d] = -1;
                    for(int c=0;c<matrix.length;c++)
                        if(matrix[c][b]!=0)
                            matrix[c][b] = -1;
                }
        }
        for(int a=0;a<matrix.length;a++)
            for(int b=0;b<matrix[a].length;b++)
                if(matrix[a][b]==-1)
                    matrix[a][b] = 0;
    }
}
