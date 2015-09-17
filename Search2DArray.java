//Search a 2D Matrix
/*
 Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
 
 Integers in each row are sorted from left to right.
 The first integer of each row is greater than the last integer of the previous row.
 For example,
 
 Consider the following matrix:
 
 [
 [1,   3,  5,  7],
 [10, 11, 16, 20],
 [23, 30, 34, 50]
 ]
 Given target = 3, return true.
 */
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 1){
            return binarySearch(matrix, target, 0);
        }
        for(int i = 1; i < matrix.length; i++){
            if(i == matrix.length-1){
                return binarySearch(matrix, target, i) || binarySearch(matrix, target, i-1);
            }
            if(target < matrix[i][0]){
                return binarySearch(matrix, target, i-1);
            }
            if(target > matrix[i][0])continue;
        }
        return false;
    }
    public boolean binarySearch(int[][] matrix, int target, int row){
        int start = 0;
        int end = matrix[0].length-1;
        
        while(start <= end){
            int mid = (start + end)/2;
            if(matrix[row][mid] < target){
                start = mid + 1;
            }
            if(matrix[row][mid] > target){
                end = mid - 1;
            }
            if(matrix[row][mid] == target){
                return true;
            }
        }
        return false;
    }
    
}