class Solution {
    public int solution(String[] babbling) {
        String[] words = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        
        for (String s : babbling) {
            int idx = 0;
            String prev = "";
            boolean ok = true;
            
            while (idx < s.length()) {
                boolean matched = false;
                for (String word : words) {
                    if (word.equals(prev)) continue;
                    if (s.startsWith(word, idx)) {
                        prev = word;
                        matched = true;
                        idx += word.length();
                        break;
                    }
                }
                if (!matched) {
                    ok = false;
                    break;
                }
            }
            
            if (ok) answer++;
        }
        return answer;
    }
}