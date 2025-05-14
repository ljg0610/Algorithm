import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0; 
        
        for (String tree : skill_trees) {
            int idx = 0;
            boolean flag = true;
            
            for (int i = 0; i < tree.length(); i++) {
                char c = tree.charAt(i);
                
                if (skill.indexOf(c) != -1) {
                    if (c != skill.charAt(idx)) {
                        flag = false;
                        break;
                    } else {
                        idx++;
                    }
                }
            }
            if (flag) {
                answer++;
            }
        }
        return answer;
    }
}