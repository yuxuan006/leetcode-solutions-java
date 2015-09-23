//Valid Anagram
/*
 Given two strings s and t, write a function to determine if t is an anagram of s.
 
 For example,
 s = "anagram", t = "nagaram", return true.
 s = "rat", t = "car", return false.
*/
public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())return false;
        
        int[] a = new int[26];
        
        Arrays.fill(a, 0);
        
        for(int i = 0; i < s.length(); i++){
            a[s.charAt(i)-'a']++;
        }
        for(int i = 0; i < s.length();i++){
            if(--a[t.charAt(i)-'a'] < 0){
                return false;
            }
        }
        return true;
    }
    
}