//Majority Element II
//Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times. The algorithm should run in linear time and in O(1) space.

public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int len = nums.length;
        if(len == 0)return list;
        if(len == 1){
            list.add(nums[0]);
            return list;
        }
        if(len == 2){
            if(nums[0] != nums[1]){
                list.add(nums[0]);
                list.add(nums[1]);
            }
            else{
                list.add(nums[0]);
            }
            return list;
        }
        Arrays.sort(nums);
        int i = 1, count = 1;
        for(; i<len; i++){
            if(nums[i] == nums[i-1]){
                count++;
                if(i == len -1 && count>len/3){
                    list.add(nums[i-1]);
                }
            }else{
                if(count > len/3){
                    list.add(nums[i-1]);
                }
                count = 1;
            }
        }
        return list;
    }
    
}