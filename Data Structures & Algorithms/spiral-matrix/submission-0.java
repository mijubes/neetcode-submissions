class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<Integer>();
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        int one = 0;
        int two = 0;
        while(top<=bottom && left<=right) {
            if(ans.size()==matrix.length*matrix[0].length)
                break;
            for(int a=left;a<=right;a++) {
                ans.add(matrix[top][a]);
            }
            top++;
            if(ans.size()==matrix.length*matrix[0].length)
                break;
            for(int a=top;a<=bottom;a++) {
                ans.add(matrix[a][right]);
            }
            right--;
            if(ans.size()==matrix.length*matrix[0].length)
                break;
            for(int a=right;a>=left;a--) {
                ans.add(matrix[bottom][a]);
            }
            bottom--;
            if(ans.size()==matrix.length*matrix[0].length)
                break;
            for(int a=bottom;a>=top;a--) {
                ans.add(matrix[a][left]);
            }
            left++;
            if(ans.size()==matrix.length*matrix[0].length)
                break;
        }
        return ans;
    }
}
