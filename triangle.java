//Triangle
/*
 Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.
 
 For example, given the following triangle
 [
 [2],
 [3,4],
 [6,5,7],
 [4,1,8,3]
 ]
 The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).
*/
public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int row = triangle.size();
        if(row == 0)return 0;
        int[] min = new int[triangle.get(row-1).size()];
        
        for(int i = row-1; i >= 0; i--){
            for(int j = 0; j < triangle.get(i).size(); j++){
                if(i == row-1){
                    min[j] = triangle.get(i).get(j);
                    continue;
                }
                min[j] = Math.min(min[j], min[j+1]) + triangle.get(i).get(j);
            }
        }
        return min[0];
    }
    
}