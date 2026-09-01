class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;
        int top=0,bot=r-1;
        while(top<=bot){
            int mid = (top + bot )/2 ;
            if(target>matrix[mid][c-1]){
                top = mid + 1;
            } else if(target<matrix[mid][0]){
                bot = mid - 1;
            } else {
                break;
            }
        }
        if (!(top <= bot)) {
            return false;
        }
        int row = (top + bot)/2;
        int l = 0,ra= c - 1;

        while(l<=ra){
            int m = (l+ra)/2;
            if(target > matrix[row][m]){
                l=m+1;
            } else if(target < matrix[row][m]){
                ra = m-1;
            } else {
                return true;
            }
        }
        return false;
    }
}
