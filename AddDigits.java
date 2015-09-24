//Add Digits
/*
 Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 
 For example:
 
 Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 
 Follow up:
 Could you do it without any loop/recursion in O(1) runtime?
*/

//solution with loops
public class Solution {
    public int addDigits(int num) {
        if(num <= 9)return num;
        
        int res = 0;
        while(num > 9){
            res = 0;
            while(num > 0){
                int digit = num%10;
                num /= 10;
                res += digit;
            }
            num = res;
        }
        return num;
        
        //return 1+(num-1)%9;
    }
    
}
//solution using digital root
//https://en.wikipedia.org/wiki/Digital_root
public class Solution {
    public int addDigits(int num) {
        if(num == 0)return 0;
        
        return 1+(num-1)%9;
    }
    
}