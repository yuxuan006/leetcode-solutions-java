//Shortest Palindrome
/*
 Given a string S, you are allowed to convert it to a palindrome by adding characters in front of it. Find and return the shortest palindrome you can find by performing this transformation.
 For example:
 
 Given "aacecaaa", return "aaacecaaa".
 
 Given "abcd", return "dcbabcd".
*/
public class Solution {
    public String shortestPalindrome(String s) {
        if(s.length() == 0)return "";
        String res = "";
        String temp = s + "#" +  new StringBuffer(s).reverse().toString();
        
        int[] pos = new int[2*s.length() + 1];
        
        pos[0] = 0;
        for(int i = 1; i <= 2*s.length(); i++){
            int j = pos[i-1];
            while(j > 0 && temp.charAt(j) != temp.charAt(i)){
                j = pos[j-1];
            }
            if(temp.charAt(i) == temp.charAt(j))++j;
            pos[i] = j;
        }
        return new StringBuilder(s.substring(pos[pos.length-1])).reverse().toString()+s;
        //return s.length() - pos[2*s.length()];
    }
    
}