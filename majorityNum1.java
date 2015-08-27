//Majority Element
//Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

public class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 1)return nums[0];
        int count = 0, majority = 0;
        for(int i = 0; i < nums.length; i++){
            if(count == 0){
                majority = nums[i];
                count = 1;
            }
            else if(majority == nums[i])count++;
            else
                count--;
        }
        return majority;
    }
    
}