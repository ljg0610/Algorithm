import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0; 
        
        Set<Character> skillSet = new HashSet<>();
        for (char c : skill.toCharArray()) {
            skillSet.add(c);
        }
        
        for (String tree : skill_trees) {
            int idx = 0;
            boolean flag = true;
            
            for (char c : tree.toCharArray()) {
                if (!skillSet.contains(c)) continue;
                
                if (c != skill.charAt(idx)) {
                    flag = false;
                    break;
                }
                idx++;
            }
            
            if(flag) {
                answer++;
            }
        }
        
        return answer;
    }
}