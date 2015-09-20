//Find Peak Element
/*
 A peak element is an element that is greater than its neighbors.
 
 Given an input array where num[i] ≠ num[i+1], find a peak element and return its index.
 
 The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.
 
 You may imagine that num[-1] = num[n] = -∞.
 
 For example, in array [1, 2, 3, 1], 3 is a peak element and your function should return the index number 2.
 
 click to show spoilers.
 
 Note:
 Your solution should be in logarithmic complexity.
*/
public class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length == 1)return 0;
        
        int i = 0;
        int j = nums.length-1;
        int mid = 0;
        
        while(i <= j){
            mid = (i+j)/2;
            if((mid == 0 || nums[mid] > nums[mid-1]) && (mid == nums.length-1 || nums[mid] > nums[mid+1])){
                return mid;
            }
            if(mid > 0 && nums[mid] < nums[mid-1]){
                
                j = mid-1;
            }
            else{
                i = mid+1;
            }
        }
        return mid;
    }
    
}