//Set Matrix Zeroes
/*
 Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.
 */
public class Solution {
    public void setZeroes(int[][] matrix) {
        boolean firstRow = false;
        boolean firstCol = false;
        
        //check if there's a 0 in the first column
        for(int i = 0; i < matrix.length; i++){
            if(matrix[i][0] == 0){
                firstCol = true;
                break;
            }
        }
        //check if there's a 0 in the first row
        for(int j = 0; j < matrix[0].length; j++){
            if(matrix[0][j] == 0){
                firstRow = true;
                break;
            }
        }
        //scan the remaining matrix, mark the zero position in the first row and first column
        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        
        //scan the remaining matrix, set the value to zero based on the first column
        for(int i = 1; i < matrix.length; i++){
            if(matrix[i][0] == 0){
                for(int j = 1; j < matrix[0].length; j++){
                    
                    matrix[i][j] = 0;
                    
                }
            }
        }
        //scan the remaining matrix, set the value to zero based on the first first
        for(int i = 1; i < matrix[0].length; i++){
            if(matrix[0][i] == 0){
                for(int j = 1; j < matrix.length; j++){
                    
                    matrix[j][i] = 0;
                    
                }
            }
        }
        //set the first row/column to zero if there's zero in first row/column
        if(firstRow){
            for(int i = 0; i < matrix[0].length; i++){
                matrix[0][i] = 0;
            }
        }
        if(firstCol){
            for(int i = 0; i < matrix.length; i++){
                matrix[i][0] = 0;
            }
        }
    }
    
}