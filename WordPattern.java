//Word Pattern
/*
 Given a pattern and a string str, find if str follows the same pattern.
 
 Examples:
 pattern = "abba", str = "dog cat cat dog" should return true.
 pattern = "abba", str = "dog cat cat fish" should return false.
 pattern = "aaaa", str = "dog cat cat dog" should return false.
 pattern = "abba", str = "dog dog dog dog" should return false.
 Notes:
 patterncontains only lowercase alphabetical letters, and str contains words separated by a single space. Each word in str contains only lowercase alphabetical letters.
 Both pattern and str do not have leading or trailing spaces.
 Each letter in pattern must map to a word with length that is at least 1.
*/

public class Solution {
    public boolean wordPattern(String pattern, String str) {
        if(pattern == null || str == null)return false;
        
        String[] str_arr = str.split(" ");
        Map<Character, String> map = new HashMap<Character, String>();
        if(pattern.length() != str_arr.length)return false;
        for(int i = 0; i < pattern.length(); i++){
            if(!map.containsKey(pattern.charAt(i))){
                if(map.containsValue(str_arr[i])){
                    return false;
                }else{
                    map.put(pattern.charAt(i), str_arr[i]);
                }
            }else{
                if(!map.get(pattern.charAt(i)).equals(str_arr[i]))return false;
            }
        }
        return true;
    }
    
}