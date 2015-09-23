//Group Anagrams
/*
 Given an array of strings, group anagrams together.
 
 For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"],
 Return:
 
 [
 ["ate", "eat","tea"],
 ["nat","tan"],
 ["bat"]
 ]
 Note:
 For the return value, each inner list's elements must follow the lexicographic order.
 All inputs will be in lower-case.
*/
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0 || strs == null)return new ArrayList<List<String>>();
        Map<String, List<String>> map = new HashMap();
        Arrays.sort(strs);
        for(int i = 0; i < strs.length; i++){
            String value = strs[i];
            char[] temp = value.toCharArray();
            Arrays.sort(temp);
            String key = String.valueOf(temp);
            
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(value);
        }
        
        return new ArrayList<List<String>>(map.values());
    }
    
}