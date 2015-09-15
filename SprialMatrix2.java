//Spiral Matrix II
/*
 Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.
 
 For example,
 Given n = 3,
 
 You should return the following matrix:
 [
 [ 1, 2, 3 ],
 [ 8, 9, 4 ],
 [ 7, 6, 5 ]
 ]
*/
public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        
        int top = 0, left = 0;
        int bottom = n-1, right = n-1;
        int value = 1;
        while(top <= bottom && left <= right){
            for(int i = left; i <= right; i++){
                res[top][i] = value++;
            }
            top++;
            if(bottom<top)break;
            
            for(int i = top; i <= bottom; i++){
                res[i][right] = value++;
            }
            right--;
            for(int i = right; i >= left; i--){
                res[bottom][i] = value++;
            }
            bottom--;
            if(right<left)break;
            for(int i = bottom; i >= top; i--){
                res[i][left]= value++;
            }
            left++;
        }
        return res;
    }
    
}