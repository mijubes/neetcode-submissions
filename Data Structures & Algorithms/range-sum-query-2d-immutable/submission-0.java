class NumMatrix {
    int[][] map;
    public NumMatrix(int[][] matrix) {
        map = matrix;
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        for(int a=row1;a<=row2;a++) 
            for(int b=col1;b<=col2;b++)
                sum+=map[a][b];
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */