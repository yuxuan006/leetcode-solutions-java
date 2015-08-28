//Unique Paths II
//Follow up for "Unique Paths":

//Now consider if some obstacles are added to the grids. How many unique paths would there be?

//An obstacle and empty space is marked as 1 and 0 respectively in the grid.

//For example,
//There is one obstacle in the middle of a 3x3 grid as illustrated below.

//[
//[0,0,0],
//[0,1,0],
//[0,0,0]
//]
//The total number of unique paths is 2.

//Note: m and n will be at most 100.

public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid[0][0] == 1 || obstacleGrid.length == 0 || obstacleGrid[0].length == 0)return 0;
        int row = obstacleGrid.length, col = obstacleGrid[0].length;
        int[][] res = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                res[i][j] = 0;
            }
        }
        if(obstacleGrid[0][0] == 1)return 0;
        else
            res[0][0] = 1;
        for(int i = 1; i < row; i++){
            if(obstacleGrid[i][0] == 0){
                res[i][0] = res[i-1][0];
            }
        }
        for(int i = 1; i < col; i++){
            if(obstacleGrid[0][i] == 0){
                res[0][i] = res[0][i-1];
            }
        }
        for(int i = 1; i < row; i++){
            for(int j = 1; j < col; j++){
                if(obstacleGrid[i][j] == 0){
                    res[i][j] = res[i-1][j] + res[i][j-1];
                }
            }
        }
        
        return res[row-1][col-1];
    }
    
}