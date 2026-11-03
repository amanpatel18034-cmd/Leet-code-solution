import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        
        Map<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String keyStr = new String(chars);
            
            if (!map.containsKey(keyStr)) {
                map.put(keyStr, new ArrayList<>());
            }
            
            map.get(keyStr).add(s);
        }
        
        return new ArrayList<>(map.values());
    }
}