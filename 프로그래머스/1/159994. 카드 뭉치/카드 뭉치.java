class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        boolean[] flags = new boolean[goal.length];
        int idx = 0;
        int idx1 = 0;
        int idx2 = 0;
        
        for (String g : goal) {
            if (idx1 < cards1.length && g.equals(cards1[idx1])) {
                idx1++;
                flags[idx++] = true;
            } else if (idx2 < cards2.length && g.equals(cards2[idx2])) {
                idx2++;
                flags[idx++] = true;
            }
        }
        
        for (int i = 0; i < goal.length; i++) {
            if(!flags[i]) return "No";
        }
        
        return "Yes";
    }
}