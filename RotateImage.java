//Rotate Image
/*
 You are given an n x n 2D matrix representing an image.
 
 Rotate the image by 90 degrees (clockwise).
 
 Follow up:
 Could you do this in-place?
*/

//O(mn) sapce complexity
public class Solution {
    public void rotate(int[][] matrix) {
        if(matrix[0].length == 1 && matrix.length == 1)return;
        
        int[][] res = new int[matrix.length][matrix[0].length];
        
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                res[j][matrix[0].length-i-1] = matrix[i][j];
            }
        }
        
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = res[i][j];
            }
        }
    }
    
}
//in-place rotate
public class Solution {
    public void rotate(int[][] matrix) {
        if(matrix[0].length == 1)return;
        int len = matrix[0].length;
        for(int i = 0; i < len-1; i++){
            for(int j = 0; j < len-i; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[len-j-1][len-i-1];
                matrix[len-j-1][len-i-1] = temp;
            }
        }
        
        for(int i = 0; i < len/2; i++){
            for(int j = 0; j < len; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[len-i-1][j];
                matrix[len-i-1][j] = temp;
            }
        }
    }
}