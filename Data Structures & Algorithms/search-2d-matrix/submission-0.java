class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int a=0;a<matrix.length;a++) {
            if(matrix[a][0]<=target && target<=matrix[a][matrix[a].length-1]) {
                int low = 0;
                int high = matrix[a].length;
                int mid = low+(high-low)/2;
                while(low<=high) {
                    mid = low+(high-low)/2;
                    if(matrix[a][mid]==target)
                        return true;
                    else if(matrix[a][mid]>target)
                        high = mid-1;
                    else
                        low = mid+1;
                }
                return false;
            }
        }
        return false;
    }
}
