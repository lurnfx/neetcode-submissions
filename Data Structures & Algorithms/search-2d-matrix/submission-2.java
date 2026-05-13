class Solution {
    // binary search
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = m * n - 1; //  3*4-1 => 11 index

        while (left <= right) {
             //left+(rigth-left) /2
          
            int mid = left + (right - left) / 2; //  0+(11-0) /2 11/2 5

            int midValue = matrix[mid/n][mid % n]; // matrix[5/3][5%3]  => 

            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
