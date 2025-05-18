import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        
        for (String mem : participant) {
            map.put(mem, map.getOrDefault(mem, 0) + 1);
        }
        
        for (String compMem : completion) {
            map.put(compMem, map.get(compMem) - 1);
        }
        
        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                return key;
            }
        }
        
        return null;
    }
}