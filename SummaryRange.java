//Summary Ranges
/*
 Given a sorted integer array without duplicates, return the summary of its ranges.
 
 For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
*/
public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<String>();
        if(nums.length == 0){
            return list;
        }
        int start = nums[0], end = nums[0];
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i+1] == nums[i] + 1){
                end = nums[i+1];
            }
            else{
                if(start != end){
                    list.add(start+"->"+end);
                }else{
                    list.add(Integer.toString(start));
                }
                start = nums[i+1];
                end = nums[i+1];
            }
        }
        if(start == end){
            list.add(Integer.toString(start));
        }
        else{
            list.add(start+"->"+end);
        }
        return list;
    }
    
}