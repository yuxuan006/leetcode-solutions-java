//Subsets
/*
 Given a set of distinct integers, nums, return all possible subsets.
 
 Note:
 Elements in a subset must be in non-descending order.
 The solution set must not contain duplicate subsets.
 For example,
 If nums = [1,2,3], a solution is:
 
 [
 [3],
 [1],
 [2],
 [1,2,3],
 [1,3],
 [2,3],
 [1,2],
 []
 ]
*/
public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(nums);
        find(nums, res, temp, 0);
        return res;
    }
    public void find(int[] nums, List<List<Integer>> res, List<Integer> temp, int pos){
        res.add(new ArrayList<>(temp));
        for(int i = pos; i < nums.length; i++){
            temp.add(nums[i]);
            find(nums, res, temp, i+1);
            temp.remove(temp.size()-1);
        }
    }
    
}