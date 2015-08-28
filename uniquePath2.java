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
        int[][] res = new int[row+2][col+2];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                res[i][j] = 0;
            }
        }
        res[row][col+1] = 1;
        for(int i = row; i >= 1; i--){
            for(int j = col; j >= 1; j--){
                if(obstacleGrid[i-1][j-1] == 1){
                    res[i][j] = 0;
                }
                else{
                    res[i][j] = res[i+1][j]+ res[i][j+1];
                }
            }
        }
        return res[1][1];
    }
    
}