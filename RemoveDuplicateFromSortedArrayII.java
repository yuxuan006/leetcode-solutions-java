//Remove Duplicates from Sorted ArrayII
/*
 Follow up for "Remove Duplicates":
 What if duplicates are allowed at most twice?
 
 For example,
 Given sorted array nums = [1,1,1,2,2,3],
 
 Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3. It doesn't matter what you leave beyond the new length.
*/
public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 2)return nums.length;
        int end = 1, i = 2;
        while(i < nums.length){
            if(nums[i] != nums[end-1]){
                nums[++end] = nums[i];
            }
            i++;
        }
        return end+1;
    }
    
}