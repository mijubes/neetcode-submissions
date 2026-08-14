class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] ans = new int[matrix[0].length][matrix.length];
        for(int a=0;a<matrix[0].length;a++) {
            for(int b=0;b<matrix.length;b++)
                ans[a][b] = matrix[b][a];
        }
        return ans;
    }
}