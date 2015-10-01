//Power of Two
/*
 Given an integer, write a function to determine if it is a power of two.
*/
public class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0)return false;
        
        int count = 0;
        while(n > 0){
            int LSB = n & 1;
            if(LSB == 1)count++;
            n >>= 1;
            if(count > 1)return false;
        }
        return true;
    }
    
}